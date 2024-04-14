/* 
 * 임의의 문자열을 변수에 담아 거꾸로 찍어보기
 * String.substring()
 */
package chapter02_dataType;

public class StringReverse {
   public static void main(String[] args) {
      String str = "가나다라마";
      System.out.print(str.substring(4,5));
      System.out.print(str.substring(3,4));
      System.out.print(str.substring(2,3));
      System.out.print(str.substring(1,2));
      System.out.println(str.substring(0,1));
   }
}

