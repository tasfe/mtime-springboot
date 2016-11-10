package com.mtime.springboot.model.po;

public class MuserinfoPO {
    private Long userId;

    private String mobile;

    private String email;

    private String nickName;

    private Long registTime;

    private String registIp;

    private String registPlatInfo;

    private Long lastLoginTime;

    private Byte userSource;

    private Byte registType;

    private String phone;

    private String realName;

    private Long brithdayTime;

    private Byte certificateType;

    private String certificateNo;

    private String income;

    private Byte marryStatus;

    private Boolean isHaveChild;

    private Byte education;

    private String career;

    private String sinaWeibo;

    private String qq;

    private String douban;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Long getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Long registTime) {
        this.registTime = registTime;
    }

    public String getRegistIp() {
        return registIp;
    }

    public void setRegistIp(String registIp) {
        this.registIp = registIp == null ? null : registIp.trim();
    }

    public String getRegistPlatInfo() {
        return registPlatInfo;
    }

    public void setRegistPlatInfo(String registPlatInfo) {
        this.registPlatInfo = registPlatInfo == null ? null : registPlatInfo.trim();
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Byte getUserSource() {
        return userSource;
    }

    public void setUserSource(Byte userSource) {
        this.userSource = userSource;
    }

    public Byte getRegistType() {
        return registType;
    }

    public void setRegistType(Byte registType) {
        this.registType = registType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Long getBrithdayTime() {
        return brithdayTime;
    }

    public void setBrithdayTime(Long brithdayTime) {
        this.brithdayTime = brithdayTime;
    }

    public Byte getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Byte certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public Byte getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(Byte marryStatus) {
        this.marryStatus = marryStatus;
    }

    public Boolean getIsHaveChild() {
        return isHaveChild;
    }

    public void setIsHaveChild(Boolean isHaveChild) {
        this.isHaveChild = isHaveChild;
    }

    public Byte getEducation() {
        return education;
    }

    public void setEducation(Byte education) {
        this.education = education;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    public String getSinaWeibo() {
        return sinaWeibo;
    }

    public void setSinaWeibo(String sinaWeibo) {
        this.sinaWeibo = sinaWeibo == null ? null : sinaWeibo.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getDouban() {
        return douban;
    }

    public void setDouban(String douban) {
        this.douban = douban == null ? null : douban.trim();
    }
}