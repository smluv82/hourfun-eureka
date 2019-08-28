package com.hourfun.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * http://호스트:포트/eureka/apps/[어플리케이션ID]를 통해
 * 연결된 어플리케이션 정보를 확인 할 수 있다.
 * 포스트맨으로도 볼수 있음(Header - Accept:application/json
 *
 * http://localhost:6002/eureka/apps/hourfun-gateway
 *
 * @author smoh
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
