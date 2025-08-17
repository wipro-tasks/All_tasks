import React, { Component } from "react";
import MenuItem from "./MenuItem";

class Restaurant extends Component {
  render() {
    return (
      <div style={{ padding: "20px", border: "2px solid #333", borderRadius: "12px", margin: "20px" }}>
        <h1>Restaurant</h1>
        <p><strong>Name:</strong>Pista House</p>
        <p><strong>Location:</strong> City Center</p>
        <p><strong>Open Hours:</strong> 10:00 AM - 11:00 PM</p>

        <hr />
        <MenuItem name="Pizza" price={250} category="Main Course" available="Yes" />
        <MenuItem name="Burger" price={120} category="Snack" available="Yes" />
        <MenuItem name="Pasta" price={180} category="Main Course" available="No" />
        <MenuItem name="Sandwich" price={90} category="Snack" available="Yes" />
      </div>
    );
  }
}

export default Restaurant;
