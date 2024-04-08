package chapter08_exception;

public class ThrowExam {

	public void test() {
		String n="A";
		try {
			if(n.equals("A")) throw new Exception("왜 하필 A 입니까???");
			System.out.println("run...........");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		ThrowExam t = new ThrowExam();
		t.test();
	}
}
