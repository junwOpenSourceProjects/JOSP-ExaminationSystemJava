# JOSP-ExaminationSystemJava - 考研成绩查询系统后台

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-25-blue.svg)
![MyBatis-Plus](https://img.shields.io/badge/MyBatis--Plus-3.5.16-blue.svg)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg)
![License](https://img.shields.io/badge/License-AGPL--3.0-blue.svg)

> 基于上交2023考研数据开发的成绩查询系统后端

## 项目简介

JOSP-ExaminationSystemJava 是一个基于 Spring Boot 3 的考研成绩查询系统后端服务，提供成绩查询、数据管理、分数线分析等功能。本项目不涉及个人信息，所有数据来自公开数据源，仅作技术交流和考研同学参考。

**前端项目**: [JOSP-ExaminationSystemVue3](https://github.com/wo1261931780/JOSP-ExaminationSystemVue3)

## 技术架构

```
graph TB
    Client[前端客户端<br/>Vue3 + ElementPlus]

    subgraph Backend[后端服务 Spring Boot 3.5.3]
        Controller[Controller层<br/>接口控制器]
        Service[Service层<br/>业务逻辑处理]
        Mapper[Mapper层<br/>MyBatis-Plus]
        Controller --> Service
        Service --> Mapper
    end

    subgraph Storage[数据存储]
        MySQL[(MySQL 8.0<br/>成绩数据库)]
    end

    subgraph Tools[工具组件]
        Knife4j[Knife4j 4.5.0<br/>API文档]
        Hutool[Hutool 5.8.41<br/>工具库]
        Fastjson2[Fastjson2 2.0.61<br/>JSON处理]
    end

    Client -->|HTTP/JSON| Controller
    Mapper --> MySQL
    Controller --> Knife4j
    Service --> Hutool
    Service --> Fastjson2

    style Client fill:#e1f5ff
    style Backend fill:#fff4e6
    style Storage fill:#f3f9ff
    style Tools fill:#f0f9ff
```

## 技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| **Spring Boot** | 3.5.3 | 核心框架 |
| **Java** | 25 | 开发语言 |
| **MyBatis-Plus** | 3.5.16 | ORM 框架 |
| **MySQL** | 8.0+ | 数据库 |
| **Knife4j** | 4.5.0 | API 文档 |
| **Hutool** | 5.8.41 | 工具库 |
| **Fastjson2** | 2.0.61 | JSON 处理 |
| **Lombok** | 1.18.38 | 简化代码 |

## 核心功能

### 成绩查询
- 学生成绩信息查询
- 成绩备份管理
- 成绩排名分析

### 院校管理
- 院校基本信息管理
- 院校分数线查询
- 院校单科线信息

### 分数线管理
- 国家线管理
- 院校线管理
- 学院线管理

### 数据管理
- 数据库合并
- 复杂表格数据处理
- 审核流程管理

## 快速开始

### 环境要求

- JDK 25+
- Maven 3.6+
- MySQL 8.0+
- Node.js 22+ (前端项目)

### 安装步骤

1. **克隆项目**
```bash
git clone https://github.com/wo1261931780/JOSP-ExaminationSystemJava.git
cd JOSP-ExaminationSystemJava
```

2. **配置数据库**
```bash
# 登录 MySQL
mysql -u root -p

# 创建数据库
CREATE DATABASE examination_system CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

3. **修改配置**
```yaml
# src/main/resources/application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/examination_system
    username: root
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver
```

4. **编译运行**
```bash
# 编译项目
mvn compile

# 启动服务
mvn spring-boot:run

# 或打包后运行
mvn package -DskipTests
java -jar target/JOSP-ExaminationSystemJava-0.0.1-SNAPSHOT.jar
```

5. **访问 API 文档**
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- Knife4j: http://localhost:8080/doc.html

## 项目结构

```
src/main/java/wo1261931780/JOSPexaminationSystemJava/
├── JospExaminationSystemJavaApplication.java   # 启动类
├── config/                                      # 配置类
│   ├── CorsConfig.java                          # 跨域配置
│   ├── GlobalExceptionHandler.java              # 全局异常处理
│   ├── MyMetaObjectHandler.java                 # 自动填充
│   ├── MybatisPlusConfig.java                   # MyBatis-Plus 配置
│   ├── OpenApiConfig.java                       # OpenAPI 配置
│   └── ShowResult.java                          # 统一响应封装
├── controller/                                  # 控制器层
├── service/                                     # 业务逻辑层
├── entity/                                     # 实体类
├── dao/                                        # 数据访问层
└── DTO/                                        # 数据传输对象
```

## 主要依赖

### Web 层
- `spring-boot-starter-web` - Web 开发
- `spring-boot-starter-webflux` - 响应式 Web
- `spring-boot-starter-web-services` - Web 服务

### 数据层
- `mybatis-plus-spring-boot3-starter` - MyBatis 增强
- `mybatis-plus-generator` - 代码生成器
- `mysql-connector-j` - MySQL 驱动

### 工具层
- `lombok` - 简化代码
- `hutool-all` - 工具集
- `fastjson2` - JSON 处理
- `commons-fileupload` - 文件上传

## 数据库表

系统涉及以下主要数据表：

| 表名 | 说明 |
|------|------|
| `student_info` | 学生信息 |
| `score_info` | 成绩信息 |
| `score_backup` | 成绩备份 |
| `academy_line` | 院校分数线 |
| `academy_line_info` | 院校单科线 |
| `college` | 学院信息 |
| `national_line` | 国家线 |
| `rank_info` | 排名信息 |
| `review_list` | 审核列表 |
| `login_user` | 登录用户 |

## API 接口

启动服务后，通过 Knife4j 文档可以查看所有 RESTful API 接口，包括：

- 学生信息管理 `/student/**`
- 成绩信息管理 `/score/**`
- 院校信息管理 `/academy/**`
- 学院信息管理 `/college/**`
- 分数线管理 `/nationalLine/**`, `/collegeLine/**`
- 登录认证 `/login/**`

## 许可证

[AGPL-3.0](./LICENSE)

---

**注意**: 本项目仅用于技术学习和交流，不得用于商业用途。所有数据均来自公开渠道，如涉及违规请自行删除。
