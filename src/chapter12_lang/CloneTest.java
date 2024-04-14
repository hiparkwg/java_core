/* 객체형 필드를 갖고 있는 클래스의 깊은 복사 */
package chapter12_lang;

import java.util.Arrays;

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
			obj.data = data.clone();

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
		System.out.println(Arrays.toString(c.data));

		System.out.println(Arrays.toString(d.data));
	}

}

