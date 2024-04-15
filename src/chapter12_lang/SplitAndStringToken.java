package chapter12_lang;
import java.util.*;
public class SplitAndStringToken {
   public static void main(String[] args) {
		String str="a/b/c///d-e,f";
		int pos=0;
		String[] sp = str.split("/|,|-");
		System.out.printf("sp.length=%d\n",sp.length);;
		
		StringTokenizer token = new StringTokenizer(str,"/,-", false);
		System.out.printf("token.countTokens=%d\n", token.countTokens());
		
		System.out.println("split result:");
		for(int i=0; i<sp.length;i++) {
			System.out.printf("sp[%d]=%s  ",i,sp[i]);
		}
		System.out.println();
		System.out.println("token result:");
		while(token.hasMoreElements()){
			System.out.printf("sp[%d]=%s  ",pos,token.nextElement());
			pos++;
		}
	}
}
