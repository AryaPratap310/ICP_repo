package week2;

import java.util.*;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= "arya";
		System.out.println(reverse(s));
	}
	public static String reverse(String S) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

}
