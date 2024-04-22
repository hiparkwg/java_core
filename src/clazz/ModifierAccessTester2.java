// ---------------------------------------------
// 다른 패키지에 있는 클래스의 메소드 접근 테스터
// 현재 클래스가 상속 관계에 없기 때문에
// public 접근권한 메서드만 접근 가능
// ---------------------------------------------

package clazz;

public class ModifierAccessTester2{
    public void test(){
        ModifierAccessTester mt = new ModifierAccessTester();
        mt.anyBody(); // public type call
        //mt.myFamily(); // protected type call
        //mt.inFolder(); // default type call
        //mt.inMy(); // private type call
    }
    public static void main(String[] args) {
        new ModifierAccessTester2().test();
    }
}
