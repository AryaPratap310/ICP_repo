package week2;

import java.util.*;

public class Delete_mid_of_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
		solve(st,1);
		System.out.println(st);
	}
	static int mid=-1;
	public static void solve(Stack<Integer> st,int idx){
        if(st.isEmpty()){
            mid=idx-(idx/2);
            return;
        }
        int ele=st.pop();
        
        solve(st,idx+1);
        
        if(idx!=mid){
            st.push(ele);
        }
    }

}
