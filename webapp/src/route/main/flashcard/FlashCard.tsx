import {Button} from "antd"
import React from "react"

const FlashCard = () => {
  return <div> <div className="flip-card">
    <div className="flip-card-inner">
      <div className="flip-card-front">
        Hello
      </div>
      <div className="flip-card-back">
        <h1>World</h1>
        <p>World</p>
        <p>World</p>
      </div>
    </div>
    <div className="mt-5">
      <Button type="primary">Remember</Button>
    </div>
  </div></div>
}

export default FlashCard
