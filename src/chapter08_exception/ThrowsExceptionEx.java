package chapter08_exception;

class ThrowsExceptionEx{
	int div(int a) throws ArithmeticException {
		int r;
		r = a / 0;
		return r;
	}

	void call(){
		try{
			div(10);
		}catch(ArithmeticException ex){
			System.out.println("연산식에 오류가 있습니다.");
		}
	}
	
	public static void main(String[] args) {
		ThrowsExceptionEx ag = new ThrowsExceptionEx();
		ag.call();
	}
}
