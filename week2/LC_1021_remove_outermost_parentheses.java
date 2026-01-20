package week2;

import java.util.*;

public class LC_1021_remove_outermost_parentheses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}
	public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(!st.isEmpty()){
                if(ch1=='('){
                    st.push(i);
                    sb.append(ch1);
                }
                else {
                    st.pop();
                    if(!st.isEmpty()){
                        sb.append(ch1);
                    }
                }
            }
            else {
                st.push(i);
            }
        }
        return sb.toString();
    }

}
