import {Button} from "antd"
import React, {useEffect, useState} from "react"
import axios from "axios"

const FlashCard = () => {
  const [data, setData] = useState(``)
  useEffect(() => {

    // axios.get(`https://www.ldoceonline.com/dictionary/dog`).then((response) => {
    //   setData(response.data)
    // })
    // axios.get(`https://www.wordreference.com/definition/dog`).then((response) => {
    //   // const newData = response.data.replace(/<(.|\n)*?>/g, ``)
    //   setData(response.data)
    //   // const element = document.get(`link`)!
    //   // element.remove()
    // })
  })
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
    <div className="">
      <Button type="primary">Remember</Button>
    </div>
  </div>
  <div dangerouslySetInnerHTML={{__html: data}} ></div>

  </div>
}

export default FlashCard
