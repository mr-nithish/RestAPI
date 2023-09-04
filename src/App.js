import React from 'react';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Login from './Login/Login';
import Signin from './Login/Signin';
import Home from './Login/Home';

function App() {
  return (
    <div>
      <Router>
        <Routes>
          <Route path='/' Component={Login}/>
          <Route path='/create' Component={Signin}/>
          <Route path='/customer' Component={Home}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
