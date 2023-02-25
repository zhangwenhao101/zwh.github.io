package 算法;

public class SortPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T.sortPut(513180);
	}

	static class T {
		static void sortPut(int n) {// 正序输出每一位
			if (n < 10) {
				System.out.print(n);
				System.out.print(" ");
			} else {
				sortPut(n / 10);
				System.out.print(n % 10);
				System.out.print(" ");
			}
		}
	}
}
