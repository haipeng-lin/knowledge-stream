## 一、关于知识流


&emsp;&emsp;一个面向互联网技术人员的知识交流平台，分为PC端和管理后台，帮助开发者快速成长。项目使用 Spring Boot、MyBatis-Plus、MySQL、Redis、ElasticSearch、MongoDB、Docker、RabbitMQ 等技术栈实现，采用主流的互联网技术架构，拥有完整的文章/教程发布、点赞收藏、评论、统计数据流程

## 二、架构功能图

### 1.模块功能图

![img](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202410212118887.jpeg)

### 2.系统架构图

> 待写



## 三、项目演示

### 1.前台PC端

![image-20240923115841732](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231158415.png)

![image-20240923115925290](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231159415.png)

![image-20240923115904110](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231159014.png)

![image-20240923120034678](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231200938.png)



### 2.后台管理端

![image-20240923113450290](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231134760.png)

![image-20240923115228658](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231152469.png)

![image-20240923115243486](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231152961.png)

![image-20240923115303808](https://haipeng-lin.oss-cn-shenzhen.aliyuncs.com/202409231153263.png)

## 四、代码结构/环境文件

### 1.代码结构

```java
knowledge-stream
    knowledge-admin		// 知识流后台管理端
	knowledge-pc		// 知识流前台PC端
		├── knowledge-api  		// 定义一些通用的枚举、实体类，定义 DO\DTO\VO 等
		├── knowledge-core 		// 核心工具/组件相关模块，如工具包 util， 通用的组件都放在这个模块
		├── knowledge-service   // 服务模块，业务相关的主要逻辑，DB 的操作都在这里
		├── knowledge-ui		// HTML 前端资源（包括 JavaScript、CSS、Thymeleaf 等）
		├── knowledge-web 		//Web模块、HTTP入口、项目启动入口，包括权限身份校验、全局异常处理等
```

### 2.环境配置说明

- 资源配置都放在 `knowledge-web` 模块的资源路径下，通过maven的env进行环境选择切换，当前提供了四种开发环境

	- resources-env/dev: 本地开发环境，也是默认环境

	- resources-env/test: 测试环境

	- resources-env/pre: 预发环境

	- resources-env/prod: 生产环境


- 环境切换命令

```bash
# 如切换生产环境
mvn clean install -DskipTests=true -Pprod
```

### 2.配置文件说明

- resources
	- application.yml: 主配置文件入口
	- application-config.yml: 全局的站点信息配置文件
	- logback-spring.xml: 日志打印相关配置文件
	- liquibase: 由liquibase进行数据库表结构管理
- resources-env
	- xxx/application-dal.yml: 定义数据库相关的配置信息
	- xxx/application-image.yml: 定义上传图片的相关配置信息
	- xxx/application-web.yml: 定义web相关的配置信息



## 五、环境搭建

### 1.开发环境

|     工具      | 版本      | 下载                                                         |
| :-----------: | :-------- | ------------------------------------------------------------ |
|      jdk      | 1.8+      | [https://www.oracle.com/java/technologies/downloads/#java8](https://www.oracle.com/java/technologies/downloads/#java8) |
|     maven     | 3.4+      | [https://maven.apache.org/](https://maven.apache.org/)       |
|     mysql     | 5.7+/8.0+ | [https://www.mysql.com/downloads/](https://www.mysql.com/downloads/) |
|     redis     | 5.0+      | [https://redis.io/download/](https://redis.io/download/)     |
| elasticsearch | 8.0.0+    | [https://www.elastic.co/cn/downloads/elasticsearch](https://www.elastic.co/cn/downloads/elasticsearch) |
|     nginx     | 1.10+     | [https://nginx.org/en/download.html](https://nginx.org/en/download.html) |
|   rabbitmq    | 3.10.14+  | [https://www.rabbitmq.com/news.html](https://www.rabbitmq.com/news.html) |
|    ali-oss    | 3.15.1    | [https://help.aliyun.com/document_detail/31946.html](https://help.aliyun.com/document_detail/31946.html) |
|      git      | 2.34.1    | [http://github.com/](http://github.com/)                     |
|    docker     | 4.10.0+   | [https://docs.docker.com/desktop/](https://docs.docker.com/desktop/) |

### 2.开发工具

|       工具       | 说明                     | 官网                                                         |
| :--------------: | ------------------------ | ------------------------------------------------------------ |
|       IDEA       | java开发工具             | [https://www.jetbrains.com](https://www.jetbrains.com)       |
|     Webstorm     | web开发工具              | [https://www.jetbrains.com/webstorm](https://www.jetbrains.com/webstorm) |
|      Chrome      | 浏览器                   | [https://www.google.com/intl/zh-CN/chrome](https://www.google.com/intl/zh-CN/chrome) |
|   ScreenToGif    | gif录屏                  | [https://www.screentogif.com](https://www.screentogif.com)   |
|     SniPaste     | 截图                     | [https://www.snipaste.com](https://www.snipaste.com)         |
|     PicPick      | 图片处理工具             | [https://picpick.app](https://picpick.app)                   |
|     MarkText     | markdown编辑器           | [https://github.com/marktext/marktext](https://github.com/marktext/marktext) |
|       curl       | http终端请求             | [https://curl.se](https://curl.se)                           |
|     Postman      | API接口调试              | [https://www.postman.com](https://www.postman.com)           |
|     draw.io      | 流程图、架构图绘制       | [https://www.diagrams.net/](https://www.diagrams.net/)       |
|      Axure       | 原型图设计工具           | [https://www.axure.com](https://www.axure.com)               |
|     navicat      | 数据库连接工具           | [https://www.navicat.com](https://www.navicat.com)           |
|     DBeaver      | 免费开源的数据库连接工具 | [https://dbeaver.io](https://dbeaver.io)                     |
|      iTerm2      | mac终端                  | [https://iterm2.com](https://iterm2.com)                     |
| windows terminal | win终端                  | [https://learn.microsoft.com/en-us/windows/terminal/install](https://learn.microsoft.com/en-us/windows/terminal/install) |
|   SwitchHosts    | host管理                 | [https://github.com/oldj/SwitchHosts/releases](https://github.com/oldj/SwitchHosts/releases) |



### 3.技术选型

- 后端技术栈

|         技术          | 说明                   | 官网                                                                                                 |
|:--------------------|----------------------|----------------------------------------------------------------------------------------------------|
| Spring & SpringMVC  | Java全栈应用程序框架和WEB容器实现 | [https://spring.io/](https://spring.io/)                                                           |
|     SpringBoot      | Spring应用简化集成开发框架     | [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)                   |
| mybatis-plus        | 数据库orm框架                     | [https://baomidou.com/](https://baomidou.com/)               |
| redis               | 内存数据存储                      | [https://redis.io](https://redis.io)                         |
| rabbitmq            | 消息队列                          | [https://www.rabbitmq.com](https://www.rabbitmq.com)         |
| docker              | 应用容器引擎                      | [https://www.docker.com](https://www.docker.com)             |
| oss                 | 对象存储                          | [https://help.aliyun.com/document_detail/31883.html](https://help.aliyun.com/document_detail/31883.html) |
| jwt                 | jwt登录                           | [https://jwt.io](https://jwt.io)                             |
| lombok              | Java语言增强库                    | [https://projectlombok.org](https://projectlombok.org)       |
| thymeleaf           | html5模板引擎                     | [https://www.thymeleaf.org](https://www.thymeleaf.org)       |
| swagger             | API文档生成工具                   | [https://swagger.io](https://swagger.io)                     |
| hibernate-validator | 验证框架                          | [hibernate.org/validator/](hibernate.org/validator/)         |
| jackson             | json/xml处理                      | [https://www.jackson.com](https://www.jackson.com)           |
| ip2region           | ip地址                            | [https://github.com/zoujingli/ip2region](https://github.com/zoujingli/ip2region) |
| websocket           | 长连接                            | [https://docs.spring.io/spring/reference/web/websocket.html](https://docs.spring.io/spring/reference/web/websocket.html) |
| sensitive-word      | 敏感词                            | [https://github.com/houbb/sensitive-word](https://github.com/houbb/sensitive-word) |
| chatgpt             | chatgpt                           | [https://openai.com/blog/chatgpt](https://openai.com/blog/chatgpt) |
| 讯飞星火            | 讯飞星火大模型                    | [https://www.xfyun.cn/doc/spark/Web.html](https://www.xfyun.cn/doc/spark/Web.html#_1-%E6%8E%A5%E5%8F%A3%E8%AF%B4%E6%98%8E) |

