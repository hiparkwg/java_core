//-------------------------------
// interface를 구현한 클래스 작성
//-------------------------------
package chapter06_oop;

public class InterfaceExam implements MyInter1{

   @Override
   public void sum(int x, int y) {
      System.out.println(x+y);
   }

   @Override
   public void div(int x, int y) {
      System.out.println(x/(double)y);
   }


   public static void main(String[] args) {
      InterfaceExam ex = new InterfaceExam();
      ex.sum(10,20);
      ex.div(10,2);
      //ex.name = "park";//상수이므로 값을 수정할 수 없음.
   }
}

class ExtendsInterExam implements ExtendsInterface{

   @Override
   public void sum(int x, int y) {
   }

   @Override
   public void div(int x, int y) {
   }

   @Override
   public void mul(int x, int y) {
   }

   @Override
   public void sub(int x, int y) {
   }
}

interface ExtendsInterface extends MyInter1, MyInter2{ }

interface MyInter1{
   String name = "my interface1";
   public void sum(int x, int y);
   public void div(int x, int y);
}

interface MyInter2{
   String irum = "my interface2";
   public void mul(int x, int y);
   public void sub(int x, int y);
}
