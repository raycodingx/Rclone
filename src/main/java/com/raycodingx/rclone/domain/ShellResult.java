package com.raycodingx.rclone.domain;

public class ShellResult {
    private Boolean success;
    private String cmd;

    private String code;

    private String msg;

    private String hostFilepath;

    public ShellResult() {
    }

    public ShellResult(Boolean success, String cmd) {
        this.success = success;
        this.cmd = cmd;
    }

    public ShellResult(Boolean success, String cmd, String hostFilepath) {
        this.success = success;
        this.cmd = cmd;
        this.hostFilepath = hostFilepath;
    }

    public ShellResult(Boolean success, String cmd, String code, String msg) {
        this.success = success;
        this.cmd = cmd;
        this.code = code;
        this.msg = msg;
    }

    public String getHostFilepath() {
        return hostFilepath;
    }

    public void setHostFilepath(String hostFilepath) {
        this.hostFilepath = hostFilepath;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return "ShellResult{" +
                "success=" + success +
                ", cmd='" + cmd + '\'' +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", hostFilepath='" + hostFilepath + '\'' +
                '}';
    }
}
