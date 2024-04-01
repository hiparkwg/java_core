package array;

import java.util.Arrays;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] su;
        su = new int[] {10,20,30};
        System.out.println(Arrays.toString(su));
        
        int[][] data ={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(Arrays.deepToString(data));

    }
    
}