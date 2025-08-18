import React from "react";
import CanteenItem from "./CanteenItem";
// Created a functional component named CanteenMenu
const CanteenMenu = () => {
  return (
    <div style={{ padding: "20px", border: "2px solid #333", borderRadius: "12px", margin: "20px" }}>
      <h1>Canteen Menu</h1>
      <p><strong>Canteen Name:</strong>royal cafe</p>
      <p><strong>Location:</strong> University Main Block</p>
      <p><strong>Open Hours:</strong> 8:00 AM - 8:00 PM</p>

      <hr />
{/* Rendering individual CanteenItem components with their respective props */}
      <CanteenItem name="Dosa" price={40} category="Breakfast" available="Yes" />
      <CanteenItem name="Pizza" price={120} category="Snackcd" available="Yes" />
      <CanteenItem name="Samosa" price={20} category="Snack" available="No" />
      <CanteenItem name="Fried Rice" price={90} category="Lunch" available="Yes" />
    </div>
  );
};

export default CanteenMenu;
