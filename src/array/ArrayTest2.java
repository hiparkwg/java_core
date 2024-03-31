package array;

public class ArrayTest2 {
   ArrayTest2(int a, int b, int c){
      int[] su = {a,b,c};
      long tot=0;
      for(int i=0 ; i<su.length ; i++){
         tot+= su[i];
      }
      System.out.println("tot=" + tot);

   }

   public static void main(String[] args) {
      new ArrayTest2(10, 20, 30);
    }

}
