
public class test2 {
	public static void main(String[] atgs) {
		int sum = 0, count = 0;
		for (int i = 1; i <= 15; i++) {
			if (i % 2 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("1から15までの偶数の和は" + sum);
		System.out.println("偶数の個数は" + count);
	}
}
