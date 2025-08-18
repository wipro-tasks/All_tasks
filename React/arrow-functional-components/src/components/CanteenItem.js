import React from "react";
//Functional component created and it receives props: name,price,category,and available
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
// Exporting this component so it can be reused in other parts
export default CanteenItem;
