import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faHome, faComment, faUsers, faClinicMedical } from '@fortawesome/free-solid-svg-icons'; // Importe os ícones necessários
import './Navbar.css';
function Navbar() {
  return (
    <div className="navbar">
      <button className="nav-button"><FontAwesomeIcon icon={faHome} /> Home</button>
      <button className="nav-button"><FontAwesomeIcon icon={faComment} /> Chat</button>
      <button className="nav-button"><FontAwesomeIcon icon={faUsers} /> Squad</button>
      <button className="nav-button"><FontAwesomeIcon icon={faClinicMedical} /> Clínicas</button>
    </div>
  );
}

export default Navbar;
