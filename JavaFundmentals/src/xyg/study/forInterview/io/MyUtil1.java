package xyg.study.forInterview.io;

import java.io.BufferedReader;
import java.io.FileReader;

public final class MyUtil1
{ // �������еķ������Ǿ�̬��ʽ���ʵ���˽�������˽�в�������������(���Ժ�ϰ��)
    private MyUtil1() {
        throw new AssertionError();
    }

    /**
     * * ͳ�Ƹ����ļ��и����ַ����ĳ��ִ��� * * @param filename �ļ��� * @param word �ַ��� * @return
     * �ַ������ļ��г��ֵĴ���
     */
    public static int countWordInFile(String filename, String word) {
        int counter = 0;
        try (FileReader fr = new FileReader(filename)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return counter;
    }
}