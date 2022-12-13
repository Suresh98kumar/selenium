package array;

import java.util.Scanner;

public class Arrayexample {
	public static void main(String[]args) {
		int arr[]=new int[5];
		arr[0]=20;
		arr[1]=15;
		arr[2]=10;
		arr[3]=5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[0] +arr[1] +arr[2] +arr[3] );
	
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
	}
	

}
