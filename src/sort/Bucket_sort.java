package sort;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Ͱ����
 * �ռ临�Ӷ� O��N+M��
 * ʱ�临�Ӷ�:
 * �����������ѡ���˿�������ʱ�临�Ӷȵļ������һ��Ӱ��
 * �ʱ�临�Ӷ� O��N^2)
 * ƽ��ʱ�临�Ӷ� O��N+C��
 * 
 * �ȶ���ȡ����ѡ��������㷨������ѡ����ǿ������򣬹ʲ��ȶ�
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
		int num=max/10;  //Ͱ������
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
