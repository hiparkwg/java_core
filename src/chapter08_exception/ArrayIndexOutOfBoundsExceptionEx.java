package chapter10_exception;

// =========================================================
// ArrayIndexOutOfBoundsException
// 배열의 인수가 잘못되었을때
//----------------------------------------------------------
// 작성자 : 박원기
// 작성일 : 2002
// =========================================================

class ArrayIndexOutOfBoundsExceptionEx{

	public static void main(String[] args) {
		String s;
		try {
			s = args[1];
			System.out.println(s);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인수가 적습니다...");
		}

	}
}
