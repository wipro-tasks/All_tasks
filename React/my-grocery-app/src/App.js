import React from "react";
import GroceryList from "./GroceryList";

function App() {
  const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      <GroceryList items={groceries} />
    </div>
  );
}

export default App;
