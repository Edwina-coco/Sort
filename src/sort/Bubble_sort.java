package sort;
/*
 * 冒泡排序(按从小到达排序)
 * 空间复杂度O(1)
 * 最好时间复杂度（有序）  O（N）
 * 最坏时间复杂度（无序）  O（N^2)
 * 平均时间复杂度  O（N^2)
 * 
 * 稳定排序
 */
public class Bubble_sort {
	public static void main(String[] args)
	{
		int a[]= {3,4,1,2,5,6,2,3,4};
		for(int i=1;i<a.length-1;i++)   //总共需要进行数组元素减一次冒泡
		{
			int flag=0;
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)break;  //可以使程序提前退出
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
