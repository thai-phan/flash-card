import {Input, AutoComplete, Form, message, Space, Button, Modal} from "antd"
import React, {useState} from "react"
import {StarFilled, StarOutlined, UserOutlined} from "@ant-design/icons"
import axios from "axios"
import WordDescription from "./WordDescription"


const Register = () => {
  const [wordList, setWordList] = useState([])
  const [wordDescription, setWordDescription] = useState(``)
  const [selected, setSelected] = useState<object>()

  const selectItem = (el: any) => ({
    key: el.id,
    value: el.target,
    label: (
      <div onClick={() => onSelectWord(el)}>{ el.target}</div>
    ),
  })

  const onSearchWord = (text: string) => {
    console.log(text)
  }

  const onSelectWord = (value: any) => {
    setSelected(value)
  }

  const onChangeSearchForm = (value: string) => {
    if (value.length != 0) {
      axios.get(`http://localhost:8080/search/${value}`).then((response) => {
        const resData = response.data
        // console.log(resData)
        setWordList(response.data.map((el: any) => ({...selectItem(el)})))
        // console.log(response.data)
      })
    }
  }


  return <div>
    <AutoComplete
      dropdownClassName="certain-category-search-dropdown"
      dropdownMatchSelectWidth={500}
      style={{width: 500}}
      options={wordList}
    >
      <Input.Search size="large"
        onSearch={(text) => onSearchWord(text)}
        onChange={(event) => onChangeSearchForm(event.target.value)} placeholder="input here"
        // onSelect={(event: any)=> onSelectWord(event.target.value)}
        // onPressEnter={(event: any)=> onSelectWord(event.target.value)}
      />
    </AutoComplete>
    <div>

    </div>
    <div className="">
      {/* {*/}
      {/*  data.length != 0 && data.map((el: any, index) =>*/}
      {/*    <div key={index} dangerouslySetInnerHTML={{__html: el.description}}></div>)*/}
      {/* }*/}
      {/* <Button*/}
      {/*  type="primary"*/}
      {/*  icon={<StarFilled />}*/}
      {/*  // loading={loadings[1]}*/}
      {/*  onClick={() => onRemoveWord(selected)}*/}
      {/* >*/}
      {/*  Click me!*/}
      {/* </Button>*/}
    </div>
    {
      selected && <WordDescription selectedWord={selected}/>
    }
  </div>
}

export default Register
