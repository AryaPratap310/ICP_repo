package week2;

import java.util.*;

public class LC_678_VP_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
		String s="(*))";
		System.out.println(checkValidString(s));
		
	}
	public static boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();        
        Stack<Integer> st2=new Stack<>();        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                st.push(i);
            }
            else if(ch=='*'){
                st2.push(i);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!st2.isEmpty()){
                    st2.pop();
                }
                else{
                    return false;
                }
            } 
        }
        while(!st.isEmpty() && !st2.isEmpty()){
            if(st.pop()>st2.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }

}
