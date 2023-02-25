package 算法;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,2,3,6,85,7,12};
		T.minMax(a, 8);
		
	}

	static class T {
		public static void minMax(int[] arr, int n) {
			 int min = arr[0], max = min;
			for (int i = 0; i < arr.length; i++) {
	 
	            if (min > arr[i]) {
	                min = arr[i];
	                continue;
	            }
	            if (max < arr[i]) {
	                max = arr[i];
	            }
	        }
			System.out.println("最大值：" + max);
	        System.out.println("最小值：" + min);
		}
	}

}
