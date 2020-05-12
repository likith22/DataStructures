package DataStructures;

public class SelectionSort {
	public void sort(int[] arr) {
		int min ;
		int temp ;
		for(int i = 0;i < arr.length;i++) {
			min = i;
			for(int j = i+1;j < arr.length;j++) {
				if(arr[j] < arr[min]) {
					temp =arr[min];
					arr[min] = arr[j];
					arr[j] = temp; 
				}
			}
		}
	}
}
