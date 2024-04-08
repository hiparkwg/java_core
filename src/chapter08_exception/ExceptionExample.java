package chapter08_exception;

import java.net.ServerSocket;
import java.util.Scanner;

public class ExceptionExample {
	public void nonTry(){
		int a=10;
		int b=0;
		int c = a/b;
		System.out.println("a/b=" + c);
		
		//ServerSocket ss = new ServerSocket(9999);
	
	}
	
	public void setTry(){
		int a=10;
		int b=2;
		int c=0;
		try{
			c=a/b;
		}catch(Exception ex){
			b=1;
			c=a/b;
			System.out.println("0으로 나누지 못함...");
		}finally{
			System.out.println("a/b=" + c);
		}
	}
	
	public void setThrows() throws Exception{
		int a=10;
		int b=0;
		int c=a/b;
	}
	
	public void makeThrows(){
		Exception obj = new Exception("박원기가 만든 오류");
		
		try{
			throw obj;// 예외를 강제로 발생시킴...
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		//ee.nonTry();
		//ee.setTry();
		
		try{
			//ee.setThrows();
		}catch(Exception ex){
			System.out.println("main()에서 체크함...오류발생");
		}finally{
			System.out.println("정상적으로 종료됨...");
		}
		
		ee.makeThrows();
	}

}








