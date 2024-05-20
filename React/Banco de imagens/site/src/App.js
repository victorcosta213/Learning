import React from 'react';
import { Breadcrumb, Flex, Layout, Menu, theme, Row, col} from 'antd';
import './index.css'
import Cards from './components/card/Cards';



const { Header, Content, Footer } = Layout;
const items = new Array(1).fill(null).map((_, index) => ({
  key: String(index + 1),
  label: "Banco de imagens",
}));



const App = () => {
  const {
    token: { colorBgContainer, borderRadiusLG },
  } = theme.useToken();

  const onChange = (currentSlide) => {
    console.log(currentSlide);
  };

  return (

    <Layout>
      <Header
        style={{
          position: 'sticky',
          top: 0,
          zIndex: 1,
          width: '100%',
          display: 'flex',
          alignItems: 'center',
        }}
      >
        <div className="demo-logo" />
        <Menu
          theme="dark"
          mode="horizontal"
          defaultSelectedKeys={['2']}
          items={items}
          style={{
            flex: 1,
            minWidth: 0,
          }}
        />
      </Header>
      <Content
        style={{
          padding: '0 48px',
        }}
      >
     
        <div
          style={{
            padding: 24,
            minHeight: 380,
            background: colorBgContainer,
            borderRadius: borderRadiusLG,
          }}
        >
          <h1>Imagens</h1>
          <Row>
            <Cards title="Natureza" link="https://cdn.pixabay.com/photo/2023/12/01/21/50/sunset-8424565_1280.jpg" refe="https://pixabay.com/pt/images/search/natureza/"/>
            <Cards title="Animais" link="https://cdn.pixabay.com/photo/2023/11/09/19/36/zoo-8378189_960_720.jpg" refe="https://pixabay.com/pt/images/search/animais/"/>
            <Cards title="Estrelas" link="https://cdn.pixabay.com/photo/2021/11/30/00/54/sweden-6834164_960_720.jpg" refe="https://pixabay.com/pt/images/search/estrelas/"/>
            <Cards title="Plantas" link="https://cdn.pixabay.com/photo/2024/02/21/15/28/dahlia-8587940_1280.jpg" refe="https://pixabay.com/pt/images/search/plantas/"/>
            <Cards title="Urbano" link="https://cdn.pixabay.com/photo/2021/02/06/12/31/dresden-5987976_960_720.jpg" refe="https://pixabay.com/pt/images/search/urbano/"/>
          </Row>
          

        </div>
      </Content>
      <Footer
        style={{
          textAlign: 'center',
        }}
      >
        VCM Design ©{new Date().getFullYear()} Created by VCM
      </Footer>
    </Layout>
  );
};
export default App;