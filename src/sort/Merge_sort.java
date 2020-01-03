package sort;
import java.util.Arrays;
/*
 * 归并排序  O(N)
 * 空间复杂度 O（NlogN)
 * 平均时间复杂度 O（NlogN)
 * 最好时间复杂度 O（NlogN)
 * 最坏时间复杂度 O（NlogN)
 * 
 * 稳定排序
 */
public class Merge_sort {
	public static void sort(int []a,int low,int mid,int high)
	{
		int []temp=Arrays.copyOf(a, a.length);
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid&&j<=high)
		{
			if(temp[i]<temp[j])
			{
				a[k++]=temp[i];
				i++;
			}
			else {
				a[k++]=temp[j];
				j++;
			}
		}
		while(i<=mid)
			a[k++]=temp[i++];
		while(j<=high)
			a[k++]=temp[j++];
	}
	public static void merge(int[]a,int low,int high)
	{
		if(low>=high)
			return;
		int mid=(low+high)/2;
		merge(a, low, mid);
		merge(a, mid+1,high);
		sort(a, low, mid, high);
		
	}
	public static void main(String[] args)
	{
		int []a= {2,3,1,5,2,6,7};
		merge(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
