package leetcode;

import java.util.Arrays;
/**
 * [120, 110, 103, 100, 89, 88, 79, 76, 67, 65, 34]
 * 考虑较小数组下标越界的问题
 *
 */
public class MergeOrderArray {
	public static void main(String[] args) {
		int[] a = { 100, 89, 88, 67, 65, 34 };
        int[] b = { 120, 110, 103, 79,76 };
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        for (int k=0;k<result.length;k++) {
            if (j<b.length&&a[i] <= b[j]){
            	result[k] = b[j];
                j++;
            }else{
            	/*数组较长的放下边 */
            	result[k] = a[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
	}

}
