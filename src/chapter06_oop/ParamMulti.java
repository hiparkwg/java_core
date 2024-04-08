package chapter06_oop;

public class ParamMulti {
    public void paramSum(int... x){
        int sum = 0;
        for(int k : x){
            sum += k;
        }
        System.out.println("sum=" + sum);
    }

    public void paramSum2(int[] x){
        int sum = 0;
        for(int k : x){
            sum += k;
        }
        System.out.println("sum=" + sum);

    }

    public static void main(String[] args) {
        ParamMulti pm = new ParamMulti();
        pm.paramSum(10,20);
        pm.paramSum(10,20,30);
        pm.paramSum(); // 가능

        pm.paramSum2(new int[]{10,20});
        pm.paramSum2(new int[]{10,20,30});
       //pm.paramSum2(); // 오류
    }
}
