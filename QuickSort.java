package DataStructures;

public class QuickSort {
	private int pIndex;
	public void sort(int[] arr,int start,int end) {
		if(start < end) {
			this.pIndex = partition(arr,start,end);
			sort(arr,start,pIndex-1);
			sort(arr,pIndex+1,end);
		}
	}
	public int partition(int[] arr,int start,int end) {
		int pivot = arr[end];
		int temp;
		int pIndex = start;
		for(int i = start; i < end ; i++) {
			if(arr[i] <= pivot) {
				temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex = pIndex + 1;
			}
		}
		temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		
		return pIndex;
	}
}
