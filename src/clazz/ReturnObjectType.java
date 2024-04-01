package clazz;

public class ReturnObjectType {
   public Data getData(String id, String name){
      Data d = new Data();
      d.id = id;
      d.name = name;
      return d;
   }
   public static void main(String[] args) {
      ReturnObjectType obj = new ReturnObjectType();
      Data r = obj.getData("a001","감자");
      
      System.out.println("ID : " + r.id);
      System.out.println("Name : " + r.name);
   }
}

class Data{
   String id;
   String name;
}
