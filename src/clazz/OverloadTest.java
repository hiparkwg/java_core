package clazz;

public class OverloadTest {
   String id="hong";
   String pwd="1111";

   public void conn(){ 
      print(); 
   }
   public void conn(String id){
      this.id = id;
      conn();
   }
   public void conn(String id, String pwd){
      this.id = id;
      this.pwd = pwd;
      print();
   }
   public void print(){
      System.out.printf("name=%s, pwd=%s 를 사용하여 연결함\n", id, pwd);
   }

   public static void main(String[] args) {
      OverloadTest ot = new OverloadTest();
      ot.conn();
      ot.conn("kim");
      ot.conn("park", "1234");
   }
}
