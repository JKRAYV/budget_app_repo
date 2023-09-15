import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Signup from './Components/Signup'; 
import Login from './Components/Login';
import Home from './Components/Home';
import Dashboard from './Components/Dashboard';

function App() {
  return (
    <Router>
      <Routes>
        {/* Define your routes using <Route> */}
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/dashboard" element={<Dashboard />} />

      </Routes>
    </Router>
  );
}

export default App;
