package com.raycodingx.rclone.service;

import com.raycodingx.rclone.domain.ShellResult;

public interface IRcloneService {
    public ShellResult copy(String filepath,String workdir);
}
