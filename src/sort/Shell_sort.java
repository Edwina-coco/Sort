package sort;
/*
 * 希尔排序（基于插入排序）
 * 空间复杂度 O（1）
 * 时间复杂度与所选择的增长序列有关
 * 
 * 
 * 
 * 不稳定，不稳定是因为相同的数据有可能会在每次分组中的不同分组中
 */
public class Shell_sort {
	public static void main(String[] args)
	{
		int []a= {7,5,1,23,4,2};
		int n=a.length;
		int p,i,D; 
		for(D=n/2;D>0;D/=2)  //D为增长序列因子
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
