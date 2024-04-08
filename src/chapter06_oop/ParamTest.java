package chapter06_oop;

public class ParamTest {
    public void param(int x, int y){
        int r = x + y;
        System.out.println("x+y=" + r);
    }

    public double param(double x, double y){
        double r = x+y;
        return r;
    }

    public static void main(String[] args) {
        ParamTest pt = new ParamTest();
        pt.param(10,20);

        double k = pt.param(10.0,20.0);
        System.out.println("k=" + k);
    }
}
