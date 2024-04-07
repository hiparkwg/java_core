/* -------------------------
 * 오버라이드 테스트
 */

package oop1;

import javax.print.PrintException;


public class OverrideExam1 extends Parents{

   // 접근자의 종류와 예외처리 종류를 바꾸어 보세요
   // 접근자 : protected, default, private
   // 예외처리 : Exception
   public void prn() throws PrintException{
      System.out.println("OverrideExam1 class");
   }
   public static void main(String[] args) {
      OverrideExam1 exam = new OverrideExam1();
      try{
         exam.prn();
      }catch(Exception ex){
         ex.printStackTrace();
      }
   }
}

class Parents{
   public void prn() throws PrintException{
      System.out.println("Parents class");
   }
}