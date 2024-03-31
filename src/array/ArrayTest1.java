package array;

public class ArrayTest1 {
   ArrayTest1(){
      int[] kor = {10,20,30,40,50};
      long tot = 0;
      long tot2 = 0;

      tot = kor[0] + kor[1] + kor[2] + kor[3] + kor[4];
      System.out.println("tot=" + tot);

      for( int i : kor){
         tot2 += i;
      }
      System.out.println("tot2=" + tot2);

   }

   public static void main(String[] args) {
      new ArrayTest1();
   }
}
