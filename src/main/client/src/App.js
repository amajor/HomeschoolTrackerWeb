import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greeting from './components/Greeting';
import UserList from './components/UserList';
import TaskList from './components/TaskList';

function App() {
  const tasks = [
    { name: "My Task 1", isChecked: true },
    { name: "My Task 2", isChecked: true },
    { name: "My Task 3", isChecked: false },
  ];

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Greeting />
        <h1>Parents</h1>
        <UserList endpoint="parents" />
        <h1>Students</h1>
        <UserList endpoint="students" />
        <TaskList tasks={tasks} />
      </header>
    </div>
  );
}

export default App;
