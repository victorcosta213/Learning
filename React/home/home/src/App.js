import React, { Component } from 'react';
import Navbar from './components/navbar/Navbar.js';
import Component1 from './components/Component1/Component1.js';
import Component2 from './components/Component2/Component2.js';
import Component3 from './components/Component3/Component3.js';



import './index.css';
import Header from './components/Header/Header.js';

function App() {
  return (
    <div className='global'>
      <Navbar/>
      <div className='main'>
        <header>perfil</header>
          <section className='sec1'>
            <Header/>
            <Component1/> 
          </section>
          <section className='sec1'>
              <Component2/>
          </section>
          <section className='sec1'>
            <Component3/>
          </section>
          
         
      </div>
    </div>
  );
}

export default App;
