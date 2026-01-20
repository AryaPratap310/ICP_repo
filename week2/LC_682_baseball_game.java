package week2;

import java.util.*;

public class LC_682_baseball_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] operations= {"5","2","C","D","+"};
		System.out.println(calPoints(operations));
		
	}
	public static int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }

}
