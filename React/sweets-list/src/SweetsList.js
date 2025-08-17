import React from "react";

const SweetsList = () => {
  
  const sweets = [
    { id: 1, name: "kala Jamun", price: 160 },
    { id: 2, name: "kaju katli", price: 180 },
    { id: 3, name: "Jalebi", price: 100 },
    { id: 4, name: "Kalakand", price: 250 },
    { id: 5, name: "kova", price: 90 }
  ];

  return (
    <div style={{ padding: "15px", border: "2px solid #444", borderRadius: "10px", margin: "20px" }}>
      <h2>Sweets List</h2>
      {sweets.map((sweet) => (
        <div key={sweet.id}>
          {sweet.name} - Price: ₹{sweet.price}
        </div>
      ))}
    </div>
  );
};

export default SweetsList;
