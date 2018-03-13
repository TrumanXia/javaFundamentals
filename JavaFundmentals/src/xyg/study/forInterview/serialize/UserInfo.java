package xyg.study.forInterview.serialize;

import java.io.Serializable;

// ʵ��Serializable�ӿڲ��ܱ����л�
public class UserInfo implements Serializable
{
    private String userName;
    private String usePass;
    private transient int userAge;// ʹ��transient�ؼ������εı������ᱻ���л�

    public String getUserName() {
        return userName;
    }

    public UserInfo() {
        userAge = 20;
    }

    public UserInfo(String userName, String usePass, int userAge) {
        super();
        this.userName = userName;
        this.usePass = usePass;
        this.userAge = userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsePass() {
        return usePass;
    }

    public void setUsePass(String usePass) {
        this.usePass = usePass;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "UserInfo [userName=" + userName + ", usePass=" + usePass + ",userAge="
                + (userAge == 0 ? "NOT SET" : userAge) + "]";
    }
}
