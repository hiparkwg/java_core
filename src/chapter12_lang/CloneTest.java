package chapter12_lang;

class MyClone implements Cloneable{
	String irum;
	String[] data;
	public MyClone(){
		data = new String[]{"kim","hong", "lee","park"};
		irum = "hong";
	}

	public MyClone getMyClone(){
		MyClone obj = null;
		try{
			obj = (MyClone)clone();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return obj;
	}
	
}
public class CloneTest {
	public static void main(String[] args) {
		MyClone c = new MyClone();
		MyClone d = c.getMyClone();
		
		d.data[0] = "aaaa";
		d.irum = "park";
		System.out.println(c.data[0]);
		System.out.println(c.irum);

		System.out.println(d.data[0]);
		System.out.println(d.irum);
	}

}

