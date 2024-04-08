package chapter06_oop;

public class FinalFieldTest {
   double pi = 3.14;
   final double PI = 3.14;
   
   public static void main(String[] args) {
      FinalFieldTest test = new FinalFieldTest();
      test.pi = 3.0;
      //test.PI = 3.0; // cannot be assigned 오류 발생
   }
}


