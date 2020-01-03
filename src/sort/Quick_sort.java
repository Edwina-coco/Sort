package sort;
/*
 * 快速排序(从小到大）
 * 平均空间复杂度 O（logN）
 * 最坏空间复杂度 O（N）
 * 平均时间复杂度 O（NlogN)
 * 最坏时间复杂度  O (N^2)
 * 最好时间复杂  O（NlogN)
 * 
 * 不稳定排序
 */
public class Quick_sort {
	public static void sort(int []a,int left,int right)
	{
		if(left>right)
			return;
		int temp=a[left];
		int i=left;
		int j=right;
		while(i<j)
		{
			while(i<j&&a[j]>=temp)
				j--;
			a[i]=a[j];
			while(i<j&&a[i]<=temp)
				i++;
			a[j]=a[i];
		}
		a[i]=temp;
		sort(a, left, i-1);
		sort(a, i+1, right);
	}
	public static void main(String[] args)
	{
		int a[]= {4,5,1,2,7,3,22,33,123,-2,2,2,2};
		sort(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
