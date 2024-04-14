/* 기본형 필드만 갖고 있는 클래스 깊은 복사 */
package chapter12_lang;

public class Point implements Cloneable{
	int x=10;
	int y=20;
	public Object clone(){
		Object o = null;
		try{
			o = super.clone();
		}catch(Exception ex){}
		return o;
	}

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = (Point)p1.clone();
		p1.x=100;
		p1.y=200;
		System.out.printf("p1.x=%d, p1.y=%d\n", p1.x, p1.y);
		System.out.printf("p2.x=%d, p2.y=%d\n", p2.x, p2.y);
	}
}
