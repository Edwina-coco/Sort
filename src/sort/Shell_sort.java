package sort;
/*
 * ϣ�����򣨻��ڲ�������
 * �ռ临�Ӷ� O��1��
 * ʱ�临�Ӷ�����ѡ������������й�
 * 
 * 
 * 
 * ���ȶ������ȶ�����Ϊ��ͬ�������п��ܻ���ÿ�η����еĲ�ͬ������
 */
public class Shell_sort {
	public static void main(String[] args)
	{
		int []a= {7,5,1,23,4,2};
		int n=a.length;
		int p,i,D; 
		for(D=n/2;D>0;D/=2)  //DΪ������������
		{
			for(p=D;p<n;p++)
			{
				for(i=p-D;i>=0&&a[i]>a[i+D];i-=D)
				{
					int temp=a[i];
					a[i]=a[i+D];
					a[i+D]=temp;
				}
			}
		}
		for (int k : a) {
			System.out.print(k+" ");
		}
	}
}
