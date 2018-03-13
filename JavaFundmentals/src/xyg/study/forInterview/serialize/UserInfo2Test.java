package xyg.study.forInterview.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class UserInfo2Test
{

    /**
     * ���л������ļ�
     * 
     * @param fileName
     */
    public static void serialize(String fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));

            out.writeObject("���л��������ǣ�");// ���л�һ���ַ������ļ�
            out.writeObject(new Date());// ���л�һ����ǰ���ڶ����ļ�
            UserInfo2 UserInfo2 = new UserInfo2("������", "961012", 21);
            out.writeObject(UserInfo2);// ���л�һ����Ա����

            out.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ���ļ��з����л�����
     * 
     * @param fileName
     */
    public static void deserialize(String fileName) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

            String str = (String) in.readObject();// �ղŵ��ַ�������
            Date date = (Date) in.readObject();// ���ڶ���
            UserInfo2 UserInfo2 = (UserInfo2) in.readObject();// ��Ա����

            System.out.println(str);
            System.out.println(date);
            System.out.println(UserInfo2);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//         serialize("text");
        deserialize("text");

        /**
         * ���޸���һ��UserInfo2���޲ι��죬���޲ι����и�userAge���Ը�ֵ�������л��õ��Ľ����userAge�����20��
         * �ó����ۣ�
         * ���Ӵ����ж���ĳ�����ʵ��ʱ�������ʵ��ʹ�õ���Externalizable���л�����ִ�������Ĺ��캯����
         * Ȼ�����readExternal���������Ը�ֵ
         */
    }

}
