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