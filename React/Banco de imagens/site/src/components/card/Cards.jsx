import React from 'react';
import { Card} from 'antd';
import style from './Cards.module.css'





const { Meta } = Card;
const Cards = ({title,link,refe}) => (

    <Card
      hoverable
      className={style.Card}
      cover={<img alt="example" src={link}/>}
    >
      <a href={refe}><Meta title={title} /></a>
      
    </Card>

);
export default Cards;