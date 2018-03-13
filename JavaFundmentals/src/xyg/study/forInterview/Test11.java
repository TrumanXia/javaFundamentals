package xyg.study.forInterview;

public class Test11 {  
    public static int staticVar = 0;  
    public int instanceVar = 0;  
  
    public Test11() {  
        staticVar++;  
        instanceVar++;  
        System.out.println("staticVar=" + staticVar + ",instanceVar="  
                + instanceVar);  
    }  
  
    public static void main(String[] args) {  
        Test11 test = new Test11();  
        Test11 test1 = new Test11();  
        Test11 test2 = new Test11();  
    }  
}  
