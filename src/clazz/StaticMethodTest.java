package clazz;

public class StaticMethodTest {
   static double max(double x, double y){
      if(x>y) return x;
      else    return y;
   }

   public static void main(String[] args) {
      StaticMethodTest test = new StaticMethodTest();
      System.out.println(test.max(10,20));
      System.out.println(StaticMethodTest.max(100,200));
   }
}
