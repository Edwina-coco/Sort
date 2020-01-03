package sort;
/*
 * 选择排序(从小到大）
 * 空间复杂度 O（1）
 * 平均时间复杂度 O（N^2)
 * 最好时间复杂度 O（N^2)
 * 最坏时间复杂度 O (N^2)
 * 
 * 不稳定排序
 */
public class Selection_sort {
	public static void main(String[] args)
	{
		int a[]= {4,2,5,1,6,7,2,3};
		for(int i=0;i<a.length;i++)
		{
			int min=a[i];
			int k=i;
			for(int j=i;j<a.length;j++) //获取最小元素及其下标
			{
				if(a[j]<min)
				{
					min=a[j];
					k=j;
				}
			}
			a[k]=a[i];
			a[i]=min;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
