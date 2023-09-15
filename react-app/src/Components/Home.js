import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div className="container">
      <h2 className="mt-5 mb-4 text-center">Welcome to our budget app</h2>
      <div className="row">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">
              <h5 className="card-title">Login</h5>
              <p className="card-text">Already have an account? Log in here.</p>
              <Link to="/login" className="btn btn-primary">
                Login
              </Link>
            </div>
          </div>
        </div>
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">
              <h5 className="card-title">Signup</h5>
              <p className="card-text">Don't have an account? Sign up now.</p>
              <Link to="/signup" className="btn btn-success">
                Signup
              </Link>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
