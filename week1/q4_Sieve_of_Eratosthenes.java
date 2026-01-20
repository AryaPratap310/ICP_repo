package week1;

import java.util.Scanner;

public class q4_Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<2){
            System.out.println(0);
        }
		else {
			boolean [] arr=new boolean[n+1];
	        arr[0]=true;
	        arr[1]=true;
	        for(int i=2;i*i<n;i++){
	            if(!arr[i]){ //  checks if i is prime
	                for(int j=i*i;j<n;j+=i) {
	                	arr[j]=true;
	                }
	            }
	        }
	        int ans=0;
	        for(int i=0;i<n;i++) {
	        	if(!arr[i]) {
	        		ans++;
	        	}
	        }
	        System.out.println(ans);
		}
	}
}
