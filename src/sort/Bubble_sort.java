package sort;
/*
 * ð������(����С��������)
 * �ռ临�Ӷ�O(1)
 * ���ʱ�临�Ӷȣ�����  O��N��
 * �ʱ�临�Ӷȣ�����  O��N^2)
 * ƽ��ʱ�临�Ӷ�  O��N^2)
 * 
 * �ȶ�����
 */
public class Bubble_sort {
	public static void main(String[] args)
	{
		int a[]= {3,4,1,2,5,6,2,3,4};
		for(int i=1;i<a.length-1;i++)   //�ܹ���Ҫ��������Ԫ�ؼ�һ��ð��
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
			if(flag==0)break;  //����ʹ������ǰ�˳�
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
