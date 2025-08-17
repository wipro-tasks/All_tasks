import React from "react";

const CanteenItem = ({ name, price, category, available }) => {
  return (
    <div style={{ border: "1px solid #aaa", margin: "10px", padding: "10px", borderRadius: "8px" }}>
      <h3>{name}</h3>
      <p><strong>Price:</strong> ₹{price}</p>
      <p><strong>Category:</strong> {category}</p>
      <p><strong>Available:</strong> {available}</p>
    </div>
  );
};

export default CanteenItem;
