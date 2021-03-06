package at.spengergasse.emotionmatcher.emotionmatchermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {
        at.spengergasse.emotionmatcher.spotifysongpicker.feign.SongFeignClient.class,
        at.spengergasse.emotionmatcher.todopicker.feign.TaskFeignClient.class,
at.spengergasse.emotionmatcher.emotionmatchermain.EmotionmatchermainApplication.class})
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class EmotionmatchermainApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmotionmatchermainApplication.class, args);

    }
}
