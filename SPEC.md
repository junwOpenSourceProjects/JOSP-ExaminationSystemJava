# JOSP-ExaminationSystemJava 技术规格说明书

> 考研成绩查询系统后端服务 | Spring Boot 3.5.3 | Java 25 | MyBatis-Plus 3.5.16

---

## 1. 项目概述

### 1.1 项目简介

JOSP-ExaminationSystemJava 是一个基于 Spring Boot 3 的考研成绩查询系统后端服务，提供考研成绩查询、数据管理、分数线分析等功能。本项目不涉及个人信息，所有数据来自公开数据源，仅作技术交流和考研同学参考。

### 1.2 项目结构

```
JOSP-ExaminationSystemJava/
├── src/main/java/wo1261931780/JOSPexaminationSystemJava/
│   ├── JospExaminationSystemJavaApplication.java   # 启动类
│   ├── config/                                      # 配置类
│   │   ├── CorsConfig.java                          # 跨域配置
│   │   ├── GlobalExceptionHandler.java              # 全局异常处理
│   │   ├── MyMetaObjectHandler.java                 # 自动填充处理器
│   │   ├── MybatisPlusConfig.java                   # MyBatis-Plus 配置
│   │   ├── OpenApiConfig.java                       # OpenAPI/Knife4j 配置
│   │   └── ShowResult.java                          # 统一响应封装
│   ├── controller/                                  # 控制器层
│   │   ├── AcademyGenerateScoreController.java
│   │   ├── AcademyLineController.java
│   │   ├── AcademySubjectListController.java
│   │   ├── CollegeController.java
│   │   ├── CollegeLineController.java
│   │   ├── ComplexTableController.java
│   │   ├── LoginController.java
│   │   ├── NationLineController.java
│   │   ├── ReviewListAllController.java
│   │   ├── ReviewListMarxismController.java
│   │   └── StudentInfoController.java
│   ├── service/                                     # 业务逻辑层
│   │   ├── AcademyGenerateScoreService.java
│   │   ├── AcademyLineInfoService.java
│   │   ├── AcademyLineService.java
│   │   ├── AcademyScoreInfoService.java
│   │   ├── CollegeLineService.java
│   │   ├── CollegeService.java
│   │   ├── ComplexTableService.java
│   │   ├── LoginUserService.java
│   │   ├── MergeDatabaseService.java
│   │   ├── NationalLineService.java
│   │   ├── RankInfoService.java
│   │   ├── ReviewListService.java
│   │   ├── ScoreBakcupService.java
│   │   ├── ScoreInfoService.java
│   │   └── StudentInfoService.java
│   ├── entity/                                     # 实体类
│   │   ├── AccountRole.java
│   │   ├── AcademyGenerateScore.java
│   │   ├── AcademyLine.java
│   │   ├── AcademyLineInfo.java
│   │   ├── AcademyScoreInfo.java
│   │   ├── AcademySingle.java
│   │   ├── College.java
│   │   ├── CollegeLine.java
│   │   ├── ComplexTable.java
│   │   ├── LoginUser.java
│   │   ├── MergeDatabase.java
│   │   ├── NationalLine.java
│   │   ├── RankInfo.java
│   │   ├── ReviewList.java
│   │   ├── ScoreBakcup.java
│   │   └── ScoreInfo.java
│   │   ├── StudentInfo.java
│   ├── dao/                                        # 数据访问层
│   │   ├── AcademyGenerateScoreMapper.java
│   │   ├── AcademyLineInfoMapper.java
│   │   ├── AcademyLineMapper.java
│   │   ├── AcademyScoreInfoMapper.java
│   │   ├── CollegeLineMapper.java
│   │   ├── CollegeMapper.java
│   │   ├── ComplexTableMapper.java
│   │   ├── LoginUserMapper.java
│   │   ├── MergeDatabaseMapper.java
│   │   ├── NationalLineMapper.java
│   │   ├── RankInfoMapper.java
│   │   ├── ReviewListMapper.java
│   │   ├── ScoreBakcupMapper.java
│   │   ├── ScoreInfoMapper.java
│   │   └── StudentInfoMapper.java
│   └── DTO/                                        # 数据传输对象
│       ├── AcademySubjectListDTO.java
│       └── StudentListDTO.java
├── src/main/resources/
│   ├── application.yml                             # 应用配置
│   ├── banner.txt                                  # 启动横幅
│   └── wo1261931780/JOSPexaminationSystemJava/DAO/
│       └── *Mapper.xml                             # MyBatis XML 映射文件
└── pom.xml                                         # Maven 配置
```

---

## 2. 技术栈

| 分类 | 技术 | 版本 | 说明 |
|------|------|------|------|
| 核心框架 | Spring Boot | 3.5.3 | 核心框架 |
| 开发语言 | Java | 25 | JDK 版本 |
| ORM | MyBatis-Plus | 3.5.16 | ORM 增强框架 |
| 数据库 | MySQL | 8.0+ | 关系数据库 |
| API 文档 | Knife4j | 4.5.0 | OpenAPI 3 文档 |
| 工具库 | Hutool | 5.8.41 | Java 工具集 |
| JSON | Fastjson2 | 2.0.61 | JSON 处理 |
| 模板引擎 | Velocity | 2.4.1 | 代码生成器模板 |
| 文件上传 | Commons-FileUpload | 1.6.0 | 文件上传组件 |
| 构建工具 | Maven | 3.6+ | 项目构建 |
| 前端 | Vue3 + ElementPlus | - | 前端项目 |

---

## 3. 主要功能模块

### 3.1 成绩查询模块
- 学生成绩信息查询
- 成绩备份管理
- 成绩排名信息

### 3.2 院校信息模块
- 院校基本信息管理
- 院校分数线查询
- 院校单科线信息
- 院校综合成绩生成

### 3.3 分数线管理模块
- 国家线管理
- 院校线管理
- 学院线管理

### 3.4 审核管理模块
- 审核列表管理
- 马克思主义审核

### 3.5 用户管理模块
- 登录认证
- 账户角色管理

### 3.6 数据管理模块
- 数据库合并
- 复杂表格数据管理

---

## 4. 数据库表

系统涉及以下主要数据表：

- `student_info` - 学生信息
- `score_info` - 成绩信息
- `score_backup` - 成绩备份
- `academy_line` - 院校分数线
- `academy_line_info` - 院校单科线
- `academy_score_info` - 院校成绩信息
- `academy_single` - 院校单独数据
- `academy_generate_score` - 院校综合成绩
- `college` - 学院信息
- `college_line` - 学院分数线
- `complex_table` - 复杂表格
- `national_line` - 国家线
- `rank_info` - 排名信息
- `review_list` - 审核列表
- `login_user` - 登录用户
- `account_role` - 账户角色
- `merge_database` - 合并数据库

---

## 5. API 文档

启动服务后，访问 Knife4j API 文档：
- URL: `http://localhost:端口/swagger-ui/index.html`
- 或：`http://localhost:端口/doc.html`

---

## 6. 配置说明

### 6.1 数据库配置

在 `application.yml` 中配置数据库连接：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/examination_system
    username: root
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### 6.2 MyBatis-Plus 配置

```yaml
mybatis-plus:
  mapper-locations: classpath*:wo1261931780/JOSPexaminationSystemJava/DAO/*Mapper.xml
  type-aliases-package: wo1261931780.JOSPexaminationSystemJava.entity
  configuration:
    map-underscore-to-camel-case: true
```

---

## 7. 环境要求

| 环境 | 版本要求 |
|------|----------|
| JDK | 25+ |
| Maven | 3.6+ |
| MySQL | 8.0+ |
| Node.js | 22+ (前端项目) |

---

## 8. 许可证

本项目采用 AGPL-3.0 开源许可证。

**注意**：本项目仅用于技术学习和交流，不得用于商业用途。所有数据均来自公开渠道，如涉及违规请自行删除。

---

## 9. 变更日志

### v0.0.1-SNAPSHOT
- 初始版本
- 支持考研成绩查询
- 提供院校分数线管理
- 支持数据备份与审核
