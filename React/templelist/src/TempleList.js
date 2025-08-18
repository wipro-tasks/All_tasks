import React from "react";

const TempleList = () => {
  // Creates an array of temple with id,name,location,deities
  const temples = [
    {
      id: 1,
      name: "Tirupati Balaji Temple",
      location: "Tirupati, Andhra Pradesh",
      deities: ["Lord Venkateswara", "Goddess Padmavathi"]
    },
    {
      id: 2,
      name: "Kashi Vishwanath Temple",
      location: "Varanasi, Uttar Pradesh",
      deities: ["Lord Shiva", "Goddess Annapurna"]
    },
    {
      id: 3,
      name: "Jagannath Temple",
      location: "Puri, Odisha",
      deities: ["Lord Jagannath", "Lord Balabhadra", "Goddess Subhadra"]
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h2>Famous Temples of India</h2>

      <table border="1" cellPadding="10" style={{ borderCollapse: "collapse", width: "100%" }}>
        <thead>
          <tr style={{ backgroundColor: "#f2f2f2" }}>
            <th>Temple Name</th>
            <th>Location</th>
            <th>Deities</th>
          </tr>
        </thead>
        <tbody>
          {/* Looping through the temples array to render each temple's data */}
          {temples.map((temple) => (
            <tr key={temple.id}>
              <td>{temple.name}</td>
              <td>{temple.location}</td>
              <td>
                <ul>
                  {/* Looping through deities array to show each deity in a list item */}
                  {temple.deities.map((deity, index) => (
                    <li key={index}>{deity}</li>
                  ))}
                </ul>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TempleList;
