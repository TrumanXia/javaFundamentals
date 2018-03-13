package xyg.study.forInterview.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// ʵ��Externalizable�ӿ����л�
public class UserInfo2 implements Externalizable
{
    private String userName;
    private String usePass;
    private int userAge;

    public String getUserName() {
        return userName;
    }

    public UserInfo2() {
        userAge = 20;// ������ڵڶ��β���ʹ�ã��жϷ����л��Ƿ�ͨ��������
    }

    public UserInfo2(String userName, String usePass, int userAge) {
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

    public void writeExternal(ObjectOutput out) throws IOException {
        /*
         * ָ�����л�ʱ��д������ԡ�������Ȼ��д������
         */
        out.writeObject(userName);
        out.writeObject(usePass);

    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        /*
         * ָ�������л���ʱ���ȡ���Ե�˳���Լ���ȡ������
         * �����д�������Զ�ȡ��˳������Է��ַ����л��Ķ�ȡ�Ķ����ָ��������ֵҲ������д�Ķ�ȡ��ʽһһ��Ӧ����Ϊ���ļ���װ�ض����������
         */
        userName = (String) in.readObject();
        usePass = (String) in.readObject();
    }

}
