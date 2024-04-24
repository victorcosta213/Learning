import React from 'react';
import './Component2.css';
import SubComponent1 from '../subcomponent1/SubComponent1';
import SubComponent2 from '../subcomponent2/SubComponent2';

function Component2() {
  return (
    <div>
      <SubComponent1 />
      <SubComponent2 />
    </div>
  );
}

export default Component2;
