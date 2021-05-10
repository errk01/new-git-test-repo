const asyncFunction = async (city) => {
  let result;
  await fetch(`https://geocode.xyz/${city}?json=1`)
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      return (result = data);
    });
  let latt = result.latt;
  let longt = result.longt;
  let cityName = result.standard.city;
  console.log(`city: ${cityName}, latitude:${latt}, longitude: ${longt}`);
};

const result = asyncFunction("phoenix");
console.log(result);
