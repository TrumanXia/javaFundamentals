package xyg.study.forInterview.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JdbcLobTest
{
    public static void main(String[] args) {
        Connection con = null;
        try { // 1. ����������Java6���ϰ汾����ʡ�ԣ�
            Class.forName("com.mysql.jdbc.Driver"); // 2. ��������
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456"); // 3.
                                                                                                     // ����������
            PreparedStatement ps = con.prepareStatement("insert into tb_user values (default, ?, ?)");
            ps.setString(1, "���"); // ��SQL����е�һ��ռλ�������ַ���
            try (InputStream in = new FileInputStream("test.jpg")) { // Java
                                                                     // 7��TWR
                ps.setBinaryStream(2, in); // ��SQL����еڶ���ռλ�����ɶ������� // 4.
                                           // ����SQL�������Ӱ������
                System.out.println(ps.executeUpdate() == 1 ? "����ɹ�" : "����ʧ��");
            }
            catch (IOException e) {
                System.out.println("��ȡ��Ƭʧ��!");
            }
        }
        catch (ClassNotFoundException | SQLException e) { // Java 7�Ķ��쳣����
            e.printStackTrace();
        }
        finally { // �ͷ��ⲿ��Դ�Ĵ��붼Ӧ������finally�б�֤���ܹ��õ�ִ��
            try {
                if (con != null && !con.isClosed()) {
                    con.close(); // 5. �ͷ����ݿ�����
                    con = null; // ָʾ�������������Ի��ոö���
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
