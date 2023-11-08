package com.raycodingx.rclone.utils;

import com.raycodingx.rclone.domain.ShellResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellUtil {
    public static ShellResult exec (String cmd, String pwd){
        if (pwd ==null | "".equals(pwd)){
            //
        }else {
            cmd = "echo " +pwd + " |sudo -S " + cmd;
        }
        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        try {
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            int i = process.waitFor();
            Boolean success = i == 0 ;
            return new ShellResult(success,cmd);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
