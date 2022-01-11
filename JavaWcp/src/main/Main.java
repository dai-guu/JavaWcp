package main;

public class Main {
	public static void main(String[] args) {
		printData("Jack Michel", 20);
		printData("Jonson Mike", 30);
	}

	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
}
