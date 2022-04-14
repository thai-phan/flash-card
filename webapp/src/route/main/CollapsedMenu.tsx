import React from 'react'
import {Layout, Menu, Breadcrumb} from 'antd'
import {UserOutlined, LaptopOutlined, NotificationOutlined} from '@ant-design/icons'

import {
  AppstoreOutlined,
  PieChartOutlined,
  DesktopOutlined,
  ContainerOutlined,
  MailOutlined,
} from '@ant-design/icons'
import {Link, Route, Routes} from "react-router-dom"
import Main from "./Main"
import FlashCard from "./flashcard/FlashCard"
import Register from './register/Register'
const {SubMenu} = Menu
const {Header, Content, Footer, Sider} = Layout


const CollapsedMenu = () => {
  return (
    <Layout>
      <Header className="header">
        <div className="logo" />

      </Header>
      <Content style={{padding: `0 50px`}}>

        <Layout className="site-layout-background" style={{padding: `24px 0`}}>
          <Sider className="site-layout-background" width={200}>
            <Menu
              defaultSelectedKeys={[`1`]}
              defaultOpenKeys={[`sub1`]}
              mode="inline"
              theme="dark"
            >
              <Menu.Item key="1" icon={<PieChartOutlined />}>
                <Link
                  to={`/flashcard`}
                >
                  Flash card
                </Link>
              </Menu.Item>
              <Menu.Item key="2" icon={<DesktopOutlined />}>
                <Link
                  to={`/register`}
                >
                  Register
                </Link>
              </Menu.Item>
              <Menu.Item key="3" icon={<ContainerOutlined />}>
                Option 3
              </Menu.Item>
              <SubMenu key="sub1" icon={<MailOutlined />} title="Navigation One">
                <Menu.Item key="5">Option 5</Menu.Item>
                <Menu.Item key="6">Option 6</Menu.Item>
                <Menu.Item key="7">Option 7</Menu.Item>
                <Menu.Item key="8">Option 8</Menu.Item>
              </SubMenu>
              <SubMenu key="sub2" icon={<AppstoreOutlined />} title="Navigation Two">
                <Menu.Item key="9">Option 9</Menu.Item>
                <Menu.Item key="10">Option 10</Menu.Item>
                <SubMenu key="sub3" title="Submenu">
                  <Menu.Item key="11">Option 11</Menu.Item>
                  <Menu.Item key="12">Option 12</Menu.Item>
                </SubMenu>
              </SubMenu>
            </Menu>
          </Sider>
          <Content style={{padding: `0 24px`, minHeight: 280}}>
            <Routes>
              <Route path="flashcard" element={<FlashCard/>} />
              <Route path="/register" element={<Register/>} />
            </Routes>
          </Content>
        </Layout>
      </Content>
      <Footer style={{textAlign: `center`}}>Ant Design ©2018 Created by Ant UED</Footer>
    </Layout>
  )
}

export default CollapsedMenu
