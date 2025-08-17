import React from "react";
import ServiceCard from "./ServiceCard";

const TailorShop = () => {
  const services = [
    {
      id: 1,
      serviceName: "Shirts",
      price: 700,
      fabricsAvailable: ["Cotton", "Linen", "Silk"]
    },
    {
      id: 2,
      serviceName: "Pants",
      price: 500,
      fabricsAvailable: ["Denim", "Polyester", "Linen"]
    },
    {
      id: 3,
      serviceName: "Lehenga",
      price: 3500,
      fabricsAvailable: ["Silk", "Velvet", "Chiffon"]
    },
    {
      id: 4,
      serviceName: "Blouse",
      price: 900,
      fabricsAvailable: ["Cotton", "Silk", "Georgette"]
    }
  ];

  return (
    <div className="container my-4">
      <h2 className="text-center mb-4">👗 Tailoring Shop Services</h2>
      <div className="row">
        {services.map((service) => (
          <ServiceCard key={service.id} service={service} />
        ))}
      </div>
    </div>
  );
};

export default TailorShop;
