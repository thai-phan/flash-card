import {Input, AutoComplete, Form, message, Space, Button} from "antd"
import React, {useState} from "react"
import {UserOutlined} from "@ant-design/icons"
import axios from "axios"

const renderTitle = (title: string) => (
  <span>
    {title}
    <a
      style={{float: `right`}}
      href="https://www.google.com/search?q=antd"
      target="_blank"
      rel="noopener noreferrer"
    >
      more
    </a>
  </span>
)

const renderItem = (title: string, count: number) => ({
  value: title,
  label: (
    <div
      style={{
        display: `flex`,
        justifyContent: `space-between`,
      }}
    >
      {title}
      <span>
        <UserOutlined /> {count}
      </span>
    </div>
  ),
})
const Element = () => {

}

const options = [
  {
    label: renderTitle(`Libraries`),
    options: [renderItem(`AntDesign`, 10000), renderItem(`AntDesign UI`, 10600)],
  },
  {
    label: renderTitle(`Solutions`),
    options: [renderItem(`AntDesign UI FAQ`, 60100), renderItem(`AntDesign FAQ`, 30010)],
  },
  {
    label: renderTitle(`Articles`),
    options: [renderItem(`AntDesign design language`, 100000)],
  },
]

const Register = () => {
  const [data, setData] = useState([])
  const [form] = Form.useForm()

  const onFinish = () => {
    message.success(`Submit success!`)
  }

  const onFinishFailed = () => {
    message.error(`Submit failed!`)
  }

  const onFill = () => {
    form.setFieldsValue({
      url: `https://taobao.com/`,
    })
  }

  const onBlur = (value: string) => {
    if (value.length != 0) {
      axios.get(`http://localhost:8080/search/${value}`).then((response) => {
        setData(response.data)
        console.log(response.data)
      })
    }
  }

  return <div>
    <AutoComplete
      dropdownClassName="certain-category-search-dropdown"
      dropdownMatchSelectWidth={500}
      style={{width: 250}}
      options={options}
    >
      <Input.Search size="large" placeholder="input here" />
    </AutoComplete>
    <div>
      <Form
        form={form}
        layout="vertical"
        onFinish={onFinish}
        onFinishFailed={onFinishFailed}
        autoComplete="off"
      >
        <Form.Item
          name="url"
          label="URL"
        >
          <Input placeholder="input placeholder" onChange={(event) => onBlur(event.target.value)} />
        </Form.Item>
        <Form.Item>
          <Space>
            <Button type="primary" htmlType="submit">
              Submit
            </Button>
            <Button htmlType="button" onClick={onFill}>
              Fill
            </Button>
          </Space>
        </Form.Item>
      </Form>
    </div>
    <div>
      {
        data.length != 0 && data.map((el:any, index) =>
          <div key={index} dangerouslySetInnerHTML={{__html: el.description}} ></div>)
      }
    </div>


  </div>
}

export default Register
