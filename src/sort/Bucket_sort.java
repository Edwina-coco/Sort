package sort;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 桶排序
 * 空间复杂度 O（N+M）
 * 时间复杂度:
 * 由于最后排序选择了快速排序，时间复杂度的计算会受一定影响
 * 最坏时间复杂度 O（N^2)
 * 平均时间复杂度 O（N+C）
 * 
 * 稳定性取决于选择的排序算法，此例选择的是快速排序，故不稳定
 */
public class Bucket_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,66,22,11,77,4,53,99};
		ArrayList<ArrayList<Integer>> bucket=new ArrayList<ArrayList<Integer>>();
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(a[i], max);
			min=Math.min(a[i], min);
		}
		int num=max/10;  //桶的数量
		for(int i=0;i<=num;i++)
		{
			bucket.add(new ArrayList<Integer>());
		}
		for (int i : a) {
			bucket.get(i/10).add(i);
		}
		for (ArrayList<Integer> arrayList : bucket) {
			Collections.sort(arrayList);
		}
		System.out.println(bucket);
	}

}
