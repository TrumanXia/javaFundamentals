package xyg.study.forInterview.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ���Ҫ���ַ����н�ȡ��һ��Ӣ��������֮ǰ���ַ�����
 * ���磺������(������)(������)(������)����ȡ���Ϊ�������У���ô������ʽ��ôд��
 * �����������ʽ��ʹ��������ƥ���ǰհ
 * @author Truman_SSD
 * @version [�汾��, 2018��3��7��]
 */
class RegExpTest
{
    public static void main(String[] args) {
        String str = "������(������)(������)(������)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
