/*
 * 같은 패키지 내에 있는 클래스의 접근권한별 접근 테스트
 */

package chapter06_oop;

public class ModifierTester {
    public void test(){
        ModifierTest mt = new ModifierTest();
        mt.anyBody(); // public type call
        mt.myFamily(); // protected type call
        mt.inFolder(); // defaul type call
        //mt.inMy();  // private type call


    }
    public static void main(String[] args) {
        new ModifierTester().test();
    }
}
