package sort;

public class Sort {

	/**
	 * 冒泡排序是比较相邻位置的两个数，而选择排序是按顺序比较，找最大值或者最小值,冒泡排序是通过数去找位置，选择排序是给定位置去找数
	 * 直接插入排序的基本思想是：将 n 个有序数存放在数组 a 中，要插入的数为 x，首先确定 x 插在数组中的位置 p，然后将 p 之后的元素都向后移一个位置，空出 a(p)，将 x 放入 a(p)，样可实现插入 x 后仍然有序。
	 * 快速排序（Quicksort）是对冒泡排序的一种改进。
	 * 		通过一趟排序，将要排序的数据分隔成独立的两部分，其中一部分的所有数据比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此使整个数据变成有序序列。
	 */
	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++){
			num[i] =  (int)(Math.random() * 100);
		}
		print(num);
//		bubbleSort(num);
//		print(num);
		quick(num);
		print(num);
	}
	public static int getMiddle(int[] list,int low,int high)
	{
	    int tmp=list[low];    //数组的第一个值作为中轴（分界点或关键数据）
	    while(low<high)
	    {
	        while(low<high&&list[high]>tmp)
	        {
	            high--;
	        }
	        list[low]=list[high];    //比中轴小的记录移到低端
	        while(low<high&&list[low]<tmp)
	        {
	            low++;
	        }
	        list[high]=list[low];    //比中轴大的记录移到高端
	    }
	    list[low]=tmp;    //中轴记录到尾
	    return low;    //返回中轴的位置
	}
	public static void unckSort(int[] list,int low,int high)
	{
	    if(low<high)
	    {
	        int middle=getMiddle(list,low,high);    //将list数组一分为二
	        unckSort(list,low,middle-1);    //对低字表进行递归排序
	        unckSort(list,middle+1,high);    //对高字表进行递归排序
	    }
	}
	public static void quick(int[] str)
	{
	    if(str.length>0)
	    {
	        //查看数组是否为空
	        unckSort(str,0,str.length-1);
	    }
	}
	private static void print(int[] num) {
		for (int i : num) {
			System.out.print(i+",");
		}
		System.out.println("\n");
	}

	private static int[] bubbleSort(int[] num) {
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length-i-1;j++){
				if(num[j+1]<num[j]){
					int t = num[j+1];
					num[j+1] = num[j];
					num[j] = t;
				}
			}
			System.out.print("第"+i+"次");
			print(num);
		}
		
		return num;
	}

}
