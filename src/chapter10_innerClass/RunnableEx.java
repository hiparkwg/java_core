/*
 * 스레드를 inner class형식으로 작성하여 실행하는 예
 */

package chapter10_innerClass;

public class RunnableEx {
   class MyThread implements Runnable{
      public void run(){
         try{
            for(int i=1; i<=5 ; i++){
               System.out.println(i);
               Thread.sleep(700);
            }
         }catch(Exception ex){
            ex.printStackTrace();
         }
      }
   }

   RunnableEx(){
      Runnable r = new MyThread();
      new Thread(r).start();
      
   }
   public static void main(String[] args) {
      new RunnableEx();
   }
   
}
