package xyg.study.concurrency.syn;

/** * �����˻� * @author ��� * */
public class Account
{
    private double balance; // �˻����

    /** * ��� * @param money ������ */
    public synchronized void deposit(double money) {
        double newBalance = balance + money;
        try {
            Thread.sleep(10); // ģ���ҵ����Ҫһ�δ���ʱ��
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = newBalance;
    }

    /** * ����˻���� */
    public double getBalance() {
        return balance;
    }
}
