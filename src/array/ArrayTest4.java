package array;

public class ArrayTest4 {
   ArrayTest4(){
      String[] address={"서울", "서울", "부산", "대구","서울"};
      String[] names={"김씨","홍씨","이씨","공씨","박씨"};

      for(int i=0 ; i<address.length ; i++){
         String ad = address[i];
         if(ad.equals("서울")){
            System.out.printf("%s-%s\n", address[i], names[i]);
         }
      }
   }

   public static void main(String[] args) {
      new ArrayTest4();
   }
}