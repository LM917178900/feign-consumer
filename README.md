feign server trouble record
1. 添加依赖后无法启动
        <dependency>
            <groupId>com.example.feign</groupId>
            <artifactId>feign-client</artifactId>
            <version>1.0</version>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
            <version>2.2.0.RELEASE</version>
        </dependency>

2. 添加的依赖正确，但还是无法启动
spring boot 版本也使用
<version>2.2.0.RELEASE</version>

3. 加入的bean 无法被发现
配置 @EnableFeignClients(basePackages = {"com.example"})
或者改变主类以适应

4. 调用 feign 接口报错
默认 使用 post 方法；

5.  Service id not legal hostname (feign_server)
服务名称不能有下划线

6. url 命名需要如此
url = "${metadata.service.url}"
7. url 赋值需要如此
metadata.service.url=${metadata_service_url:http://localhost:8080}

8. feign 传输字符串 有转义符
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-text</artifactId>
            <version>1.6</version>
        </dependency>
        
        LOGGER.info("before param is  {}",param);
        if(param.contains("\"")) {
            param = StringEscapeUtils.unescapeJava(param);
            param= param.replaceFirst("\"", "");
            param= param.substring(0,param.length()-1);
        }
        LOGGER.info("after param is  {}",param);

