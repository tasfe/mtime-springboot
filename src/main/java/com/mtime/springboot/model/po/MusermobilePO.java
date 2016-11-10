package com.mtime.springboot.model.po;

public class MusermobilePO {
    private Long mobileId;

    private Long userId;

    private String mobile;

    private Byte userSource;

    private Byte status;

    private Boolean isDelete;

    private Long createTime;

    private String creater;

    private Long updateTime;

    private String updater;

    public Long getMobileId() {
        return mobileId;
    }

    public void setMobileId(Long mobileId) {
        this.mobileId = mobileId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getUserSource() {
        return userSource;
    }

    public void setUserSource(Byte userSource) {
        this.userSource = userSource;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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