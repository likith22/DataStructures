import DataStructures.QuickSort;
public class TestQuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int arr[] = {1,76,4,2,22};
		qs.sort(arr, 0, 4);
		
		for(int  i = 0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

