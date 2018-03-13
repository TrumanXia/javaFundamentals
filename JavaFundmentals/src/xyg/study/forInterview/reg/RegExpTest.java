package xyg.study.forInterview.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 如果要从字符串中截取第一个英文左括号之前的字符串，
 * 例如：北京市(朝阳区)(西城区)(海淀区)，截取结果为：北京市，那么正则表达式怎么写？
 * 下面的正则表达式中使用了懒惰匹配和前瞻
 * @author Truman_SSD
 * @version [版本号, 2018年3月7日]
 */
class RegExpTest
{
    public static void main(String[] args) {
        String str = "北京市(朝阳区)(西城区)(海淀区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
