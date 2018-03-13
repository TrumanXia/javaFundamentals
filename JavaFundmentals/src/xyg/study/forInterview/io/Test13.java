package xyg.study.forInterview.io;

import java.io.File;

/**
 * 
 * 如果需要对文件夹继续展开，代码如下所示
 * 
 * @author Truman_SSD
 * @version [版本号, 2018年3月7日]
 */
class Test13
{
    public static void main(String[] args) {
        showDirectory(new File("/Users/Hao/Downloads"));
    }

    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if (f.isDirectory()) {
            for (File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        }
        else {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
}
