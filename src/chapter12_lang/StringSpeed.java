/*
 * String과 StringBuilder의 속도차
 */
package chapter12_lang;

public class StringSpeed {
   public static void main(String[] args) {
      String str = "a";
		long sTime=0, eTime=0, rTime=0, rTime2;
		
		//---------------------------------------
		// String
      //---------------------------------------
		sTime = System.currentTimeMillis();
		for(int i=0;i<99000;i++) str += "a";
		eTime = System.currentTimeMillis();
		
		rTime = (eTime-sTime);
		System.out.println("Time1 : " + (rTime/1000d) + " 초");
		
      //---------------------------------------
		// StringBuilder
      //---------------------------------------

		StringBuilder sb = new StringBuilder();
		sTime = System.currentTimeMillis();
		for(int i=0;i<99000;i++) sb.append("a");
		eTime = System.currentTimeMillis();
		rTime2 = (eTime-sTime);
		System.out.println("Time2 : " + (rTime2/1000d) + " 초");
		
		System.out.println(rTime/rTime2 + " 배");
   }
}
