import React, { useState, useEffect } from "react";
import axios from "axios";

export default function Pokemon() {
  const [data, setData] = useState(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/pokemon")
      .then((response) => {
        console.log(response);
        setData(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  if (!data) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      {data.map((pokemon) => (
        <li key={pokemon.id}>
          <img src={pokemon.frontImage} alt={pokemon.name} />
          <img src={pokemon.backImage} alt={pokemon.name} />
          <h2>{pokemon.name}</h2>
          
        </li>
      ))}
    </div>
  );
}