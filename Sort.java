package 算法;

public class Sort {
	/**
	 * 基数排序法
	 * 
	 * @param data
	 *            ，待排序的数组
	 * @param d
	 *            ，数字的位数
	 */
	void RadixSort(int data[], int d) {
		int n = data.length;
		int tmp[] = new int[n];
		int count[] = new int[10];
		int radix = 1;
		for (int i = 0; i < d; i++) {
			int j;
			for ( j = 0; j < 10; j++) 
				count[j] = 0;

				for (j = 0; j < n; j++) {

					int k = (data[j] / radix) % 10;
					count[k]++;
				}

				for (j = 1; j < 10; j++) {
					count[j] = count[j - 1] + count[j];
				}

				for (j = n - 1; j >= 0; j--) {
					int k = (data[j] / radix) % 10;
					tmp[count[k] - 1] = data[j];
					count[k]--;
				}

				for (j = 0; j < n; j++)
					data[j] = tmp[j];
				radix *= 10;
			
		}
	}

	public static void main(String[] args) {

		int data[] = { 300, 115, 120, 100, 339, 438, 580, 870 };
		Sort s = new Sort();
		s.RadixSort(data, 3);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}