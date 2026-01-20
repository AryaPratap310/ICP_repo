package week1;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(solve(arr));
	}
	public static int solve(int []arr) {
		int profit=0;
		int buy=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<buy) {
				buy=arr[i];
			}
			if(arr[i]-buy>profit) {
				profit=arr[i]-buy;
			}
		}
		return profit;
		
	}

}
