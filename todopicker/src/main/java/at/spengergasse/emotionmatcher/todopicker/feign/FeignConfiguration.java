package at.spengergasse.emotionmatcher.todopicker.feign;

import feign.Logger;
import feign.Request;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCircuitBreaker
@EnableFeignClients
public class FeignConfiguration {
    // public static final int FIVE_SECONDS = 5000;

    @Bean
    public Logger.Level logLevel() {
        return Logger.Level.FULL;
    }
/*
    @Bean
    public Request.Options options() {
        return new Request.Options(FIVE_SECONDS, FIVE_SECONDS);
    }
    */
}
