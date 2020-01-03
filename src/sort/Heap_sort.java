package sort;
/*
 * 堆排序
 * 空间复杂度 O（1）
 * 平均时间复杂度 O（NlogN)
 * 最好最坏时间复杂度  O（NlogN)
 * 
 * 不稳定排序
 */
public class Heap_sort {
	 static void sort(int []a) 
	 {
		 for(int i=a.length/2-1;i>=0;i--)  //从第一个非叶子节点开始构造大顶堆
		 {
			HeadAdjustment(a,i,a.length); 
		 }
		 for(int i=a.length-1;i>=0;i--)  //逐一交换堆顶元素与末尾元素
		 {
			 swap(a, 0, i);
			 HeadAdjustment(a,0,i);  //重新对堆进行调整
		 }
	 }
	 static void swap(int[] a,int b,int c)
	 {
		 int temp=a[b];
		 a[b]=a[c];
		 a[c]=temp;
	 }
	 static void HeadAdjustment(int []a,int i,int length)  //构建大顶堆
	 {
		 int temp=a[i];
		 for(int k=2*i+1;k<length;k=2*k+1)  //从i节点的左子节点开始，也就是2*i+1
		 {
			 if(k+1<length&&a[k]<a[k+1])//在满足条件时并且左子节点小于右子节点
			 {
				 k=k+1; //k指向右子节点
			 }
			 if(temp<a[k])  //如果子节点大于父节点，那么将子节点的值复制给父节点
			 {
				 a[i]=a[k];//仅仅是交换元素，并没有赋值，因为交换后temp的值还有可能会小于k节点的左右子树的值，所以还需要继续进行判断
				 i=k;
			 }
		 }
		 a[i]=temp;  //将temp放于最终位置
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
