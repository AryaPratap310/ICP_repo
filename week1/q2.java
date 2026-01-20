package week1;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(solve(s1,s2));
	}
	public static int solve(String s1,String s2) {
		int n=s2.length();
		if(n>s1.length()) {
			return -1;
		}
		for(int i=0;i<=s1.length()-n;i++) {
			if(s1.substring(i,i+n).equals(s2)) {
				return i;
			}
		}
		return -1;
		
	}

}
