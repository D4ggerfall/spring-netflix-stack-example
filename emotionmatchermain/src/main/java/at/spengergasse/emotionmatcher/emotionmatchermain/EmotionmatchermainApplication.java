package at.spengergasse.emotionmatcher.emotionmatchermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
//@EnableHystrix
@EnableHystrixDashboard
//@EnableEurekaServer
public class EmotionmatchermainApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmotionmatchermainApplication.class, args);
    }
}
