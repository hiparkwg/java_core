package chapter06_oop;

public class FinalMethodTest extends FinalMethod{

   // 오류발생
   int sum(int x, int y){
      return (x+y)*2;
   }
   
   public static void main(String[] args) {
      FinalMethodTest test = new FinalMethodTest();
      System.out.println("x+y=" + test.sum(10,20));
   }
}

class FinalMethod{
   final int sum(int x, int y){
      return x+y;
   }
}
