package sort;
/*
 * ��������(��С����
 * ƽ���ռ临�Ӷ� O��logN��
 * ��ռ临�Ӷ� O��N��
 * ƽ��ʱ�临�Ӷ� O��NlogN)
 * �ʱ�临�Ӷ�  O (N^2)
 * ���ʱ�临��  O��NlogN)
 * 
 * ���ȶ�����
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
