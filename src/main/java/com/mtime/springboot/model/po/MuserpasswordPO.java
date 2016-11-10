package com.mtime.springboot.model.po;

public class MuserpasswordPO {
    private Long passwordId;

    private Long userId;

    private String password;

    private Byte passwordSource;

    private Long createTime;

    private String creater;

    private Long updateTime;

    private String updater;

    public Long getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Long passwordId) {
        this.passwordId = passwordId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getPasswordSource() {
        return passwordSource;
    }

    public void setPasswordSource(Byte passwordSource) {
        this.passwordSource = passwordSource;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}