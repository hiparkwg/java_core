// ---------------------------------------------
// 다른 패키지에 있는 있는 크래스의 메소드 접근 테스터
// ModifierTest 클래스를 상속받았기 때문에
// public, protected 접근권한은 접근할 수 있지마
// default, private 는 접근할 수 없음.
// ---------------------------------------------

package clazz;

import chapter06_oop.ModifierTest;

public class ModifierAccessTester extends ModifierTest {
    public void test(){
        this.anyBody();// public type call
        this.myFamily(); // protected type call
        //this.inFolder(); // default type call
        //this.inMy(); // private type call

    }
    public static void main(String[] args) {
        new ModifierAccessTester().test();        
    }
}
