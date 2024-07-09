package constructorandarrays;

import java.util.Scanner;

public class EvenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Even elements are: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
