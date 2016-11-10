package com.mtime.springboot.model.po;

public class MusertokenlogPO {
    private Long tokenLogId;

    private Long userId;

    private String nickName;

    private String mobile;

    private String email;

    private String avatarUrl;

    private String token;

    private String lat;

    private String lng;

    private String platInfo;

    private String loginIp;

    private Long loginTime;

    private Long logoutTime;

    private Long brokenTime;

    private Long timeoutTime;

    private Long createTime;

    private Long updateTime;

    public Long getTokenLogId() {
        return tokenLogId;
    }

    public void setTokenLogId(Long tokenLogId) {
        this.tokenLogId = tokenLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getPlatInfo() {
        return platInfo;
    }

    public void setPlatInfo(String platInfo) {
        this.platInfo = platInfo == null ? null : platInfo.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Long getBrokenTime() {
        return brokenTime;
    }

    public void setBrokenTime(Long brokenTime) {
        this.brokenTime = brokenTime;
    }

    public Long getTimeoutTime() {
        return timeoutTime;
    }

    public void setTimeoutTime(Long timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}