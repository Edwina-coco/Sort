package sort;
/*
 * 插入排序
 * 空间复杂度 O（1）
 * 平均时间复杂度 O（N^2)
 * 最好时间复杂度 O（N）
 * 最坏时间复杂度 O（N^2)
 * 
 * 稳定排序
 */
public class Insertion_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {4,2,1,6,7,3};
		int i,j;
		for(i=1;i<a.length;i++)
		{
			int temp=a[i];
			for(j=i;j>0&&a[j-1]>temp;j--)
			{
				a[j]=a[j-1];
			}
		a[j]=temp;
		}
		for (int num : a) {
			System.out.print(num+" ");
		}
	}

}
