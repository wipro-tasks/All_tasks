import React from "react";
import Juice from "./Juice";

const JuiceList = () => {
//Declaring an array of juice objects with id, name,price  
  const juices = [
    { id: 1, name: "Grape Juice", price: 60 },
    { id: 2, name: "Musk melon Juice", price: 80 },
    { id: 3, name: "Apple Juice", price: 40 },
    { id: 4, name: "Pineapple Juice", price: 90 }
  ];

  return (
    <div style={{ margin: "20px", padding: "15px", border: "2px solid #333", borderRadius: "10px" }}>
      <h2>Juice Menu</h2>
      <table border="1" cellPadding="10" cellSpacing="0">
        <thead>
          <tr>
            <th>ID</th>
            <th>Juice Name</th>
            <th>Price (₹)</th>
          </tr>
        </thead>
        <tbody> {/* Looping through the juices array and rendering a Juice component for each item */}
          {juices.map((juice) => (
            <Juice key={juice.id} id={juice.id} name={juice.name} price={juice.price} /> //passing juice ID,name,price as a properties
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default JuiceList;
