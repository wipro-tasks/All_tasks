import React, { Component } from "react";

class MenuItem extends Component {
  //render defines what should be displayed on screen
  render() {
    const { name, price, category, available } = this.props; //it will extract individual values
    return (
      <div style={{ border: "1px solid #aaa", margin: "10px", padding: "10px", borderRadius: "8px" }}>
        <h3>{name}</h3>
        <p><strong>Price:</strong> ₹{price}</p>
        <p><strong>Category:</strong> {category}</p>
        <p><strong>Available:</strong> {available}</p>
      </div>
    );
  }
}

export default MenuItem;
