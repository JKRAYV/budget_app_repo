import React, { useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const Login = () => {
  const [formData, setFormData] = useState({
    username: '',
    password: '',
  });
  const [username, setUsername] = useState("");

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const loginData = {
      username: formData.username,
      password: formData.password,
    };
  
    axios
      .post('http://localhost:8080/api/auth/signin', loginData)
      .then((response) => {
        console.log('Login successful');
        setUsername(formData.username)
        window.location.href = '/dashboard';      })

      .catch((error) => {
        console.error('Error logging in:', error);
      });
  };



  return (
    <div className="container">
      <Link to="/" className="btn btn-secondary mt-3">
        Back to Home
      </Link>

      <h2>Login</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="username">Username</label>
          <input
            type="text"
            className="form-control"
            id="username"
            name="username"
            value={formData.username}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input
            type="password"
            className="form-control"
            id="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit" className="btn btn-primary">
          Login
        </button>
      </form>
    </div>
  );

};
export default Login;
