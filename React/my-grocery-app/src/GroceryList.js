import React from "react";
// Creating a functional component
const GroceryList = ({ items }) => {
  //Function to handle button click and it shows alert when groceries are added
  const handleAddToCart = () => {
    alert("Groceries Added to Cart!");
  };

  return (
    <div>
      <h2>Grocery List</h2>
      {/*Rendering the list of grocery items using map*/}
      <ul>
        {items.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
      <button onClick={handleAddToCart}>Add to Cart</button>
    </div>
  );
};
//Exporting the component so it can be used in other files
export default GroceryList;



  