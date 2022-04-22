import React, {useEffect, useState} from "react"
import {Button} from "antd"
import {StarFilled, StarOutlined} from "@ant-design/icons"
import axios from "axios"

interface IWordDescription {
  selectedWord: any
}

const WordDescription: React.FC<IWordDescription> = ({selectedWord}: IWordDescription) => {
  const [isRemember, setIsRemember] = useState<boolean>(false)

  useEffect(() => {
    axios.post(`http://localhost:8080/check-word-time-status`, {
      wordId: selectedWord.id,
      userId: 1,
    }).then((response) => {
      const isRemembered = response.data
      setIsRemember(isRemembered)
    })
  })

  const onRemoveWord = (word: any) => {
    axios.post(`http://localhost:8080/delete-word-time`, {
      wordId: selectedWord.id,
      userId: 1,
    }).then((response) => {
      if (response.data) {
        setIsRemember(false)
      }
    })
  }

  const onRememberWord = (word: any) => {
    axios.post(`http://localhost:8080/remember-word-time`, {
      wordId: selectedWord.id,
      userId: 1,
    }).then((response) => {
      if (response.data) {
        setIsRemember(true)
      }
    })
  }

  return <div className="mt-5">
    {
      isRemember ? <Button
        type="primary"
        icon={<StarFilled/>}
        // loading={loadings[1]}
        onClick={() => onRemoveWord(selectedWord)}
      >
        Remembered
      </Button> : <Button
        type="primary"
        icon={<StarOutlined/>}
        // loading={loadings[1]}
        onClick={() => onRememberWord(selectedWord)}
      >
        Remember
      </Button>

    }
    <div className="mt-3">
      <div dangerouslySetInnerHTML={{__html: selectedWord.description}}></div>

    </div>
  </div>
}

export default WordDescription
