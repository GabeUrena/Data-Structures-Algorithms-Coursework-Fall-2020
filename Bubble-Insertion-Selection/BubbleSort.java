
public class BubbleSort extends TestTimes implements SortInterface{

	@Override
	public void sort(Integer[] arrayToSort) {
		  int n = arrayToSort.length; 
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arrayToSort[j] > arrayToSort[j+1]) { 
	                    int temp = arrayToSort[j]; 
	                    arrayToSort[j] = arrayToSort[j+1]; 
	                    arrayToSort[j+1] = temp; 
	                }
	            }
	        }
	}
}
