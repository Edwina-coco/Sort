package sort;
/*
 * ѡ������(��С����
 * �ռ临�Ӷ� O��1��
 * ƽ��ʱ�临�Ӷ� O��N^2)
 * ���ʱ�临�Ӷ� O��N^2)
 * �ʱ�临�Ӷ� O (N^2)
 * 
 * ���ȶ�����
 */
public class Selection_sort {
	public static void main(String[] args)
	{
		int a[]= {4,2,5,1,6,7,2,3};
		for(int i=0;i<a.length;i++)
		{
			int min=a[i];
			int k=i;
			for(int j=i;j<a.length;j++) //��ȡ��СԪ�ؼ����±�
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
