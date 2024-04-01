package clazz;

public class ModifierTest {
    // 아무나 접근할 수 있는 메소드
    public void anyBody(){
        System.out.println("아무나 접근할 수 있는 메소드입니다.");
    }
    // 상속이나 같은 패키지에서만 접근할 수 있는 메소드
    protected void myFamily(){
        System.out.println("상속관계가 있거나 같은 패키지 내에서만 접근 가능한 메소드입니다.");
    }

    // 같은 패키지내에서만 접근 가능
    void inFolder(){
        System.out.println("같은 패키지내에서만 접근 가능한 메소드입니다.");
    }

    private void inMy(){
        System.out.println("나만 접근할 수 있는 메서드입니다.");
    }
}
