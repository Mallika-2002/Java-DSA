package array;

import java.util.*;


public class Nthlargest {
	static int nthLargest(int ar[],int size,int n) {
		Arrays.sort(ar);
		return ar[size-n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input size : ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		
		for(int i=0;i<size;i++) {
				ar[i] = sc.nextInt();	
	}
//		element to find
int n =5;
System.out.print("Nth Largest largest = "+ nthLargest(ar,size,n));
	}

}
