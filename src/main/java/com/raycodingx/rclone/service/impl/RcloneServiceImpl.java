package com.raycodingx.rclone.service.impl;

import com.raycodingx.rclone.domain.ShellResult;
import com.raycodingx.rclone.service.IRcloneService;
import com.raycodingx.rclone.utils.ShellUtil;
import org.springframework.stereotype.Service;

import java.io.File;


@Service
public class RcloneServiceImpl implements IRcloneService {

    @Override
    public ShellResult copy(String filepath,String workdir) {

        String basename = filepath.substring(0,filepath.lastIndexOf("/") + 1);
        //String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
        String cmd = "docker run --rm -v " + workdir + ":/data:shared " +"--user $(id -u):$(id -g) yingzigene-rclone:v1 copy ftp:" + basename + " /data" +basename;
        ShellResult res = ShellUtil.exec(cmd, "");
        res.setHostFilepath(workdir + filepath);
        return res;
    }

    public static void main(String[] args) {
        String workdir = "/data";
        String filepath = "/tmp/rs/baidu/ray/1.txt";
        String basename = filepath.substring(0,filepath.lastIndexOf("/") + 1);
        String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
        String cmd = "docker run --rm -v " + workdir + ":/data:shared " +"--user $(id -u):$(id -g) yingzigene-rclone:v1 copy ftp:"+ basename + " /data" +basename;
        System.out.println("dockerCommand: " + cmd);
        File file = new File("docker/rclone/conf/rclone.conf");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
    }
}
