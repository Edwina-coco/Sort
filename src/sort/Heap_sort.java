package sort;
/*
 * ������
 * �ռ临�Ӷ� O��1��
 * ƽ��ʱ�临�Ӷ� O��NlogN)
 * ����ʱ�临�Ӷ�  O��NlogN)
 * 
 * ���ȶ�����
 */
public class Heap_sort {
	 static void sort(int []a) 
	 {
		 for(int i=a.length/2-1;i>=0;i--)  //�ӵ�һ����Ҷ�ӽڵ㿪ʼ����󶥶�
		 {
			HeadAdjustment(a,i,a.length); 
		 }
		 for(int i=a.length-1;i>=0;i--)  //��һ�����Ѷ�Ԫ����ĩβԪ��
		 {
			 swap(a, 0, i);
			 HeadAdjustment(a,0,i);  //���¶Զѽ��е���
		 }
	 }
	 static void swap(int[] a,int b,int c)
	 {
		 int temp=a[b];
		 a[b]=a[c];
		 a[c]=temp;
	 }
	 static void HeadAdjustment(int []a,int i,int length)  //�����󶥶�
	 {
		 int temp=a[i];
		 for(int k=2*i+1;k<length;k=2*k+1)  //��i�ڵ�����ӽڵ㿪ʼ��Ҳ����2*i+1
		 {
			 if(k+1<length&&a[k]<a[k+1])//����������ʱ�������ӽڵ�С�����ӽڵ�
			 {
				 k=k+1; //kָ�����ӽڵ�
			 }
			 if(temp<a[k])  //����ӽڵ���ڸ��ڵ㣬��ô���ӽڵ��ֵ���Ƹ����ڵ�
			 {
				 a[i]=a[k];//�����ǽ���Ԫ�أ���û�и�ֵ����Ϊ������temp��ֵ���п��ܻ�С��k�ڵ������������ֵ�����Ի���Ҫ���������ж�
				 i=k;
			 }
		 }
		 a[i]=temp;  //��temp��������λ��
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,5,7,1,2,3,6,9};
		sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
