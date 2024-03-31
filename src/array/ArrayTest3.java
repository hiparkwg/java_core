// ---------------------------------
// 배열에 저장된 값들의 홀/짝수 구분
// ---------------------------------

package array;

import java.util.Arrays;

public class ArrayTest3 {
   ArrayTest3(){
      int[] su = {1,2,3,4,5,6,7,8,9};
      int[] odd = new int[su.length];
      int[] even = new int[su.length];
      int oddCnt=0;
      int evenCnt=0;
      for(int s : su){
         if(s%2==0) {
            even[evenCnt]= s;
            evenCnt++;
         }else{
            odd[oddCnt] =s;
            oddCnt++;
         }
      }

      System.out.println("odd : " + Arrays.toString(odd));
      System.out.println("even : " + Arrays.toString(even));
   }

   public static void main(String[] args) {
      new ArrayTest3();
   }
}
