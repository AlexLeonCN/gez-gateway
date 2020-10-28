package com.gez;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*该项目实现SpringBoot整合Mybatis/mybatis-plus/JSP
 * @author user
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class SpringBootRun {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRun.class, args);
	}
}
