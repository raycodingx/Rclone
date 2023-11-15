package com.raycodingx.rclone.utils;

import com.raycodingx.rclone.domain.ShellResult;

public class RcloneUtil {
    public static ShellResult copy(String filepath, String workdir){
        String basename = filepath.substring(0,filepath.lastIndexOf("/") + 1);
        String cmd = "docker run --rm -v " + workdir + ":/data:shared " +"--user $(id -u):$(id -g) custom-rclone:v1 copy ftp:" + basename + " /data" +basename;
        ShellResult res = ShellUtil.exec(cmd, "");
        res.setHostFilepath(workdir + filepath);
        return res;
    }
}
