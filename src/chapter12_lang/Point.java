package chapter12_lang;

public class Point implements Cloneable{
	int x;
	int y;
	public Object clone(){
		Object o = null;
		try{
			o = super.clone();
		}catch(Exception ex){}
		return o;
	}
}
