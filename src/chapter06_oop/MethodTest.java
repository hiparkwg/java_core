package chapter06_oop;

public class MethodTest {
    public int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        int r = mt.sum(10,20);
        System.out.println("a+b=" + r);
    }
}
