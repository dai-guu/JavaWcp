
public class no_comma {
	public static void main(String[] args) {
		int a[] = new int[20];
		for (int i = 1; i - 1 < a.length; i++) {
			a[i - 1] = i * 5;
		}
		System.out.print("奇数 : ");
		for (int w = 0; w < 2; w++) {
			for (int j = w; j < a.length; j += 2) {
				if (j != a.length - 1 && j != a.length - 2) {
					System.out.print(a[j] + ",");
				} else {
					System.out.print(a[j]);
				}
			}
			if (w != 1) {
				System.out.print("\n偶数 : ");
			}
		}
	}
}
