//-------------------------------
// interface를 구현한 클래스 작성
//-------------------------------
package oop1;

public class InterfaceExam implements MyInter1{

   @Override
   public void sum(int x, int y) {

   }

   @Override
   public void div(int x, int y) {

   }
   
}

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
