import React from "react";

const GroceryList = ({ items }) => {
  const handleAddToCart = () => {
    alert("Groceries Added to Cart!");
  };

  return (
    <div>
      <h2>Grocery List</h2>
      <ul>
        {items.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
      <button onClick={handleAddToCart}>Add to Cart</button>
    </div>
  );
};

export default GroceryList;