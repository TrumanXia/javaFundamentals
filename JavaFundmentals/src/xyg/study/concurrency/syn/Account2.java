package xyg.study.concurrency.syn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** * �����˻� * * @author ��� * */
public class Account2
{
    private Lock accountLock = new ReentrantLock();
    private double balance; // �˻����

    /** * ��� * * @param money * ������ */
    public void deposit(double money) {
        accountLock.lock();
        try {
            double newBalance = balance + money;
            try {
                Thread.sleep(10); // ģ���ҵ����Ҫһ�δ���ʱ��
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            balance = newBalance;
        }
        finally {
            accountLock.unlock();
        }
    }

    /** * ����˻���� */
    public double getBalance() {
        return balance;
    }

}
