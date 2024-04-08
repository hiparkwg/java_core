package chapter08_exception;

// =========================================================
// NumberFormatException
// 문자열을 숫자로 변환시킬수 없을때
//----------------------------------------------------------
// 작성자 : 박원기
// 작성일 : 2002
// =========================================================


class  NumberFormatExceptionEx
{

	public static void main(String[] args) 
	{
		int i;

		try
		{
			i=Integer.parseInt(args[0]);
		
		}

		catch(NumberFormatException e)
		{
			System.out.println("숫자가 아님..");
		}

		System.out.println(args[0]);	
		

	}
}
