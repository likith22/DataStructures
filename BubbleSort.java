package DataStructures;

public class BubbleSort {
	int temp;
	int flag = 0;
	public void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] >= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = 1;
				}//end of if
			}//end of j loop
			if(flag == 0) {
				break;
			}//end of if
		}//end of i loop
	}//end of sort function
}//end of class BubbleSort
