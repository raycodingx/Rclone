package com.raycodingx.rclone.service.impl;

import com.raycodingx.rclone.domain.ShellResult;
import com.raycodingx.rclone.service.IRcloneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RcloneServiceImpl implements IRcloneService {
    @Value("rclone.workdir")
    private String workdir;

    @Override
    public ShellResult copy(String filepath) {
        return null;
    }
}
