package com.github.ivansjr.feignspotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignSpotifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignSpotifyApplication.class, args);
    }

}
