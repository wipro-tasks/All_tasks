import React, { useState } from "react";

const Phone = () => {
  //useState is used to create a phone object with brand, model, and price
  const [phone, setPhone] = useState({
    brand: "Apple",
    model: "iPhone 16",
    price: 220000
  });

  
  const updatePrice = () => {
    //spread operator to keep other properties (brand, model) unchanged
    setPhone({ ...phone, price: phone.price + 5000 }); 
  };

  return (
    <div style={{ border: "2px solid #333", padding: "15px", margin: "20px", borderRadius: "10px" }}>
      <h2>Phone Details</h2>
      <p><strong>Brand:</strong> {phone.brand}</p>
      <p><strong>Model:</strong> {phone.model}</p>
      <p><strong>Price:</strong> ₹{phone.price}</p>
      <button onClick={updatePrice} style={{ padding: "8px 12px", background: "blue", color: "white", border: "none", borderRadius: "5px", cursor: "pointer" }}>
        Update Price
      </button>
    </div>
  );
};

export default Phone;
