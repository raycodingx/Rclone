package com.raycodingx.rclone.utils;

import com.raycodingx.rclone.domain.ShellResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShellUtil {
    public static ShellResult exec (String cmd, String pwd){
        ArrayList<String> cmds = new ArrayList<>();
        cmds.add("bash");
        cmds.add("-c");
        if (pwd ==null | "".equals(pwd)){
            //
        }else {
            cmd = "echo " +pwd + " |sudo -S " + cmd;
        }
        cmds.add(cmd);
        ProcessBuilder processBuilder = new ProcessBuilder(cmds);
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
