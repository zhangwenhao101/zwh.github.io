package 算法;

public class MaxRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,10,100,39,38,80,70};
		System.out.println(FindMax.getMax(arr,8));
	}
	 static class FindMax{
		public static int  getMax(int[] arr, int n ){
			if(n == 1){
				return arr[n-1];
			}else if(arr[n-1]>getMax(arr,n-1)){
					return arr[n-1];
				}else{
					return getMax(arr,n-1);
				}
			}
		
	 }
}
 
		

 
