package week2;

import java.util.*;

public class LC_20_Valid_Parenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(isValid(s));
		
	}
	public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{'|| ch=='[') {
            	st.push(ch);
            }
            else if(!st.isEmpty()) {
            	if(ch==')' && st.pop()!='(') {
            		return false  ;
            	}
	            if(ch=='}' && st.pop()!='{') {
            		return false  ;
            	}
	            if(ch==']'&& st.pop()!='[') {
            		return false  ;
            	}
            }
            else {
            	return false;
            }
        }
        return st.isEmpty();
    }

}
