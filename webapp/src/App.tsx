import React from 'react'
import './App.css'
import CollapsedMenu from "./component/CollapsedMenu"

const App = () => {
  return (
    <div className="App">
      <CollapsedMenu/>
      <div className="flip-card">
        <div className="flip-card-inner">
          <div className="flip-card-front">
              adsfadasdf asdf
          </div>
          <div className="flip-card-back">
            <h1>John Doe</h1>
            <p>Architect & Engineer</p>
            <p>We love that guy</p>
          </div>
        </div>
      </div>
    </div>
  )
}

export default App
