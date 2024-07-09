package constructorandarrays;

import java.util.Scanner;

public class AddElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size: ");
	int size = sc.nextInt();
	int[] array = new int[size];
	System.out.println("Enter array elements: ");
	
	for(int i=0;i<array.length;i++) {
		array[i] = sc.nextInt();
	}
	
	System.out.println("Enter array element to be added and the index within "+(size-1)+":");
	int n = sc.nextInt();
	int j = sc.nextInt();
	array[j]=n;
	
	System.out.println("New array is: ");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
  }
}
