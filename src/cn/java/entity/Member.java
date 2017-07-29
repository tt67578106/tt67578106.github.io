package cn.java.entity;

public class Member {
    private Long id;

    private Integer mId;

    private String mName;

    private String mGender;

    private Integer mAge;

    private String mAddress;

    private String mEmail;

    @Override
    public String toString() {
        return "Member [id=" + id + ", mId=" + mId + ", mName=" + mName + ", mGender=" + mGender + ", mAge=" + mAge
                + ", mAddress=" + mAddress + ", mEmail=" + mEmail + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}