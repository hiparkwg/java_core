/* 주민번호 일부분을 사용하여 생년월일 성별 구분 
 * String.split(), String.substring() 사용
*/

package chapter02_dataType;

public class BirthCheck {
   public static void main(String[] args) {
      String birthday = "901225-1";
      String year   = birthday.substring(0,2);
      String month  = birthday.substring(2,4);
      String day    = birthday.substring(4,6);
      String temp   = (birthday.split("-"))[1];
      String gender = "";
      if(temp.equals("1")) gender = "남자";
      else                 gender = "여자";

      System.out.println("생년 : " + year);
      System.out.println("생월 : " + month);
      System.out.println("생일 : " + day);
      System.out.println("성별 : " + gender);
   }
}
