import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greeting from './components/Greeting';
import UserList from './components/UserList';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Greeting />
        <h1>Parents</h1>
        <UserList endpoint="parents" />
        <h1>Students</h1>
        <UserList endpoint="students" />
      </header>
    </div>
  );
}

export default App;
