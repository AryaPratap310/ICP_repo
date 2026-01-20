package week2;

import java.util.*;

public class LC_844_Backspace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= "ab##";
		String t= "c#d#";
		System.out.println(backspaceCompare(s,t));
	}
	public static boolean backspaceCompare(String s, String t) {
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(i);
                
            }
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(i);
            }
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        if(st1.size()!=st2.size()){
            return false;
        }

        while(!st1.isEmpty()){
            int i1=st1.pop();
            int i2=st2.pop();
            if(s.charAt(i1)!=t.charAt(i2)){
                return false;
            }
        }
        return true;

    }

}
