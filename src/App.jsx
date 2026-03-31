import React from "react";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import Destinations from "./pages/Destinations";
import TripPlanner from "./pages/TripPlanner";
import Packages from "./pages/Packages";

function App() {
  return (
    <div>
      <Navbar />
      <Home />
      <Destinations />
      <TripPlanner />
      <Packages />
    </div>
  );
}

export default App;