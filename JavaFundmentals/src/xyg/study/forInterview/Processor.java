package xyg.study.forInterview;

public class Processor
{
    static int n;

    public static void main(String[] args) {
        Float num = 3.4f;
        short n1 = 5;
        // short s1 = 1; s1 += 1;
        // short s1 = 1; s1 = s1 + 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5)
                    break;
//                    continue;
                System.out.println("i=" + i + ";" + "j=" + j);
            }
        }
    }
}
