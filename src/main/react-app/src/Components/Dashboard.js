import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import RemoveCookie from '../hooks/removeCookie';
import GetCookie from '../hooks/getCookie';

const Dashboard = () => {
  const navigate = useNavigate();
  const User = GetCookie('loggedInUser');
  const [transactions, setTransactions] = useState([]);

  const handleLogout = () => {
    RemoveCookie(User);
    navigate('/');
  };

  useEffect(() => {
    fetch('http://localhost:8080/api/transaction', {
      method: 'GET'
    })
      .then(response => response.json())
      .then(data => setTransactions(data))
      .catch(error => console.error('Error fetching transactions:', error));
  }, [User]);

  return (
    <div>
      <h1>Welcome to the BUDGET TRACKER APP Dashboard {User}</h1>

      <button
        type="button"
        className="btn btn-primary"
        onClick={handleLogout}
      >
        Logout
      </button>

      {/* Display fetched transactions */}
      <div>
        <h2>Transactions</h2>
        <ul>
          {transactions.map(transaction => (
            <li key={transaction.id}>
              {/* Display transaction details here */}
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default Dashboard;
