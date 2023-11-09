package com.raycodingx.rclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RcloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(RcloneApplication.class,args);
        System.out.println("启动RcloneApplication！");
    }
}
