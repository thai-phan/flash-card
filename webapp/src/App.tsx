import React from 'react'
import {
  Routes,
  Route,
  Link,
} from "react-router-dom"

import './App.css'
import CollapsedMenu from "./route/main/CollapsedMenu"
import Main from './route/main/Main'

const App = () => {
  return (
    <div className="App">
      <Routes>
        <Route path="/*" element={<Main/>} />
        <Route path="/main/*" element={<Main/>} />
        <Route
          path="*"
          element={
            <main style={{padding: `1rem`}}>
              <p>There's nothing here!</p>
            </main>
          }
        />
      </Routes>
    </div>
  )
}

export default App
