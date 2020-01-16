package me.kajundrama.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
  public static void main(String[] args) {
    SpringApplication.run(EurekaClientApplication.class, args);
  }

}
