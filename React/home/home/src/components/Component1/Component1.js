import React from 'react';
import img from './img/humor.png';
import './Component1.css'

function Component1() {
  return (
    <div>
      <h2>Pronta para avaliar seu dia?</h2>
      <img src={img} alt="Descrição da imagem"/>
    </div>
  );
}

export default Component1;
