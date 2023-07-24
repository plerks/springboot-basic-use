## 说明
Spring Boot框架整合Mybatis最基础的使用，无实际用途仅做示例。需要本地有一个叫spring-boot-basic-use的MySQL数据库，表结构和数据可用database/user.sql导入，用户名和密码在application.yaml中配置。

## 运行
`mvn spring-boot:run`运行。

## 打包生成可执行jar并运行
参考spring的[文档](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.first-application.executable-jar.maven)，添加插件:
```
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
然后`mvn clean package`打包即可生成可执行jar，再`java -jar jar包路径`也可运行。

## 查看效果
* <http://localhost:8080/> 主页
* <http://localhost:8080/hello> 返回字符串"hello"
* <http://localhost:8080/queryByName?name=Tom> 查询数据库中name=Tom的user