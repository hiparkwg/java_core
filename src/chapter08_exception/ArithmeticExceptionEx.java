package chapter10_exception;

// =========================================================
// ArrayIndexOutOfBoundsException
// 배열의 인수가 잘못되었을때
//----------------------------------------------------------
// 작성자 : 박원기
// 작성일 : 2002
// =========================================================

class ArithmeticExceptionEx{

	public static void main(String[] args) {
		int x, y;

		try {
			x = 20;
			y = x / 0;
		}catch (ArithmeticException e) {
			System.out.println("연산식에 오류가 있습니다.");
		}
		System.out.println("정상 종료됨.");
	}
}
