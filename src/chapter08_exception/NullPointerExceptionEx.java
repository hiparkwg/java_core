package chapter08_exception;

// =========================================================
// NumberFormatException
// 문자열을 숫자로 변환시킬수 없을때
//----------------------------------------------------------
// 작성자 : 박원기
// 작성일 : 2002
// =========================================================


class  NullPointerExceptionEx
{

	public static void main(String[] args) 
	{
		String s=new String();

		try
		{
			System.out.println(s);				
		}

		catch(NullPointerException e)
		{
			System.out.println("인수가 적습니다...");
		}


		

	}
}
