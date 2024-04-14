/*
 * 문자열을 "=="으로 비교해서는 안되는 이유
 */
package chapter12_lang;

public class StringCompare {
   public static void main(String[] args) {

		String a="홍길동";
		String b="홍길동";
		
		//위와 같은 방법으로 문자열이 생성된 경우엔 
		// "=="으로 비교해도 기대값과 동일하게 나옴
		System.out.println(a==b); // true
		System.out.println(a.equals(b)); //true
		
		String c = new String("홍길동");
		String d = new String("홍길동");

		// 위와 같이 문자열이 생성된 경우 "=="는 기대치와 다름
		System.out.println(c==d); // false
		System.out.println(c.equals(d)); //true
		
		// 따라서 문자열 비교는 항상 euqlas()로 비교
		
	}
}
