# 苍穹外卖
苍穹外卖学习记录(部分功能未完成如：微信支付功能)

### "完美的"README模板
一个"完美的"README模板去快速开始你的项目！  
[探索本项目的文档 »](https://github.com/WFishDragon/sky-take-out)   

[查看Demo](https://github.com/WFishDragon/sky-take-out) · [报告Bug](https://github.com/WFishDragon/sky-take-out/issues) · [提出新特性](https://github.com/WFishDragon/sky-take-out/issues)

 本篇README.md面向开发者

## 目录
+ [上手指南](#上手指南)
    - [开发前的配置要求](#开发前的配置要求)
    - [安装步骤](#安装步骤)
+ [文件目录说明](#文件目录说明)
+ [开发的架构](#开发的架构)
+ [部署](#部署)
+ [使用到的框架](#使用到的框架)
+ [版本控制](#版本控制)
+ [作者](#作者)

### 上手指南
以下指南将帮助你在本地机器上安装和运行该项目，进行开发和测试。关于如何将该项目部署到在线环境，请参考**安装步骤**。

请将所有链接中的“shaojintian/Best_README_template”改为“your_github_name/your_repository”



#### 开发前的配置要求
1. IntelliJ IDEA
2. MySQL数据库
3. Redis数据库
4. 微信开发者工具
5. 阿里云账号

### 文件目录说明
```plain
mp-weixin为微信小程序目录
nginx-1.20.2为服务器前端页面
sky_take_out.sql为MySQL数据库文件
```

#### **安装及运行步骤**
##### 一.项目安装
1. 方法1：
+ 获取你的github密匙以便使用克隆功能
+ 将项目克隆到你的电脑中

```shell
git clone https://github.com/WFishDragon/sky-take-out.git
```

+ 在IDEA中对项目进行导入
2. 方法2:
+ 点击Download ZIP下载到本地

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727254093663-3dfa3da9-813a-47e2-b97d-3b1deca87740.png)

+ 在IDEA对项目进行导入

##### 二.数据库导入
1.在自己的MySQL软件中对主目录下的sky_take_out.sql文件进行导入

成功如同：![](https://img-blog.csdnimg.cn/img_convert/afe67c744bd07b411e8e5f890dff5dc8.png)

##### 三.创建阿里云的环境变量
![](https://i-blog.csdnimg.cn/direct/f57e5ce05aaa44dba9ba3fa84afdc7d2.png)

具体查看[在Windows系统环境变量中设置阿里云AccessKey](https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems)



##### 四.修改配置文件
配置文件位于项目下的sky-server\src\main\resources里面的application-dev.yml文件  
![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253017116-b6524b09-cc67-4176-9d05-3ba9f88ce3ba.png)

:::info
配置MySQL数据库，配置数据库的用户名和密码

:::

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253106713-813f965a-54c7-4da5-a8f4-3ae8f76aaaf8.png)

:::info
配置阿里云OSS对象属性

:::

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253182675-4f2936cc-a688-4dee-9c4b-1c7cbce85176.png)

:::info
配置redis数据库的属性

:::

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253216732-636856aa-e5d3-405a-97a2-9963d100446d.png)

:::info
配置微信小程序的属性具体查看[微信官方文档](https://developers.weixin.qq.com/miniprogram/dev/wxcloudrun/src/guide/weixin/pay.html)

:::

##### 五.运行项目
需要运行的地方有：

1.前端部分，运行nginx-1.20.2下的nginx.exe文件

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253607737-c2bd9555-574f-46cf-87dd-6ce78d3805e2.png)

2.后端部分，打开IDEA打开项目，在上述配置完成后运行maven compile对整个项目进行编译

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253805696-22ada54d-a2fc-408e-a772-9bc34d7aabe8.png)

编译通过后运行项目

![](https://cdn.nlark.com/yuque/0/2024/png/48895758/1727253676539-7bd59320-f39f-42c4-8bde-4659f2fe5fa3.png)

3.微信小程序部分，打开微信开发者工具导入主目录下的mp-weixin，将微信开发工具的版本调至2.24.2

4.运行完成后在网页输入[http://localhost:9090](http://localhost:9090/)/，使用管理员账户登录默认用户名admin,密码123456

微信小程序直接运行即可进入

### 开发的架构
+ 分层构架
+ 云服务构架

### 部署
暂无

### 使用到的框架
+ SpringBoot
+ Vue
+ Mybatis
+ Redis
+ jQuery



### 版本控制
该项目使用Git进行版本管理。您可以在repository参看当前可用版本。

### 作者
1294438721@qq.com

 qq:1294438721   



