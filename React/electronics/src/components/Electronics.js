import React, { useState } from "react";
// Created a functional component named Electronics
const Electronics = () => {
  // useState hook to store the name of the electronic item 
  const [name] = useState("Laptop"); //store the name of the electronic item
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(55000);

  // Update brand
  const updateBrand = () => {
    setBrand("HP"); // change brand to HP (you can choose any brand)
  };

  // Increase price
  const increasePrice = () => {
    setPrice(price + 5000); // increase by ₹5000
  };

  return (
    <div style={{ border: "2px solid #333", padding: "15px", margin: "20px", borderRadius: "10px" }}>
      <h2>Electronic Item Details ⚡</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>Brand:</strong> {brand}</p>
      <p><strong>Price:</strong> ₹{price}</p>

      <button
        onClick={updateBrand}
        style={{ marginRight: "10px", padding: "8px 12px", background: "green", color: "white", border: "none", borderRadius: "5px" }}
      >
        Update Brand
      </button>

      <button
        onClick={increasePrice}
        style={{ padding: "8px 12px", background: "blue", color: "white", border: "none", borderRadius: "5px" }}
      >
        Increase Price
      </button>
    </div>
  );
};

export default Electronics;
