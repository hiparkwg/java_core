package clazz;

public class StaticFieldTest {
   public static void main(String[] args) {
      Marine m1 = new Marine("kim");
      Marine m2 = new Marine("lee");
      Marine m3 = new Marine("hong");

      //공격 당했을 때
      m1.hp=7;
      m2.hp=5;
      m3.hp=3;
      System.out.printf(m1.toString());
      System.out.printf(m2.toString());
      System.out.printf(m3.toString());
      
      //마린 화학공장건설 완료
      Marine.armor=20;
      m1.damage=20;
      System.out.printf(m1.toString());
      System.out.printf(m2.toString());
      System.out.printf(m3.toString());

      //공장 건설이후에 태어난 마린
      Marine m4 = new Marine("park");
      System.out.printf(m4.toString());
   }   
}

class Marine{
   String name;
   int hp=10; // 현재체력
   static int damage = 5; //공격력
   static int armor = 5; // 방어력
   Marine(String n){
      this.name = n;
   }
   public String toString(){
      String str = String.format("name=%s, hp=%d, damage=%d, armor=%d\n", 
            name, hp, damage, armor);
      return str;            

   }
}