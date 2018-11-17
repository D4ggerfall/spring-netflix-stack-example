package at.spengergasse.emotionmatcher.emotionmatchermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaServer
@ComponentScan(basePackageClasses = {
        at.spengergasse.emotionmatcher.spotifysongpicker.feign.SongFeignClient.class,
        at.spengergasse.emotionmatcher.todopicker.feign.TaskFeignClient.class,})
@EnableFeignClients
public class EmotionmatchermainApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmotionmatchermainApplication.class, args);

    }
}
