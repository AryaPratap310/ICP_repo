package week2;
import java.util.*;

public class LC_NGE2 {

	public static void main(String[] args) {
		int []nums= {};
		int arr[]= {1,2,1};
		int res[]=NGE2(arr);
		for(int x:res) {
			System.out.print(x+" ");
		}
	}
	public static int[] NGE2(int []arr) {
        int n=arr.length;
        Integer []ans=new Integer[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<ans.length*2;i++) {
			while(!st.isEmpty() && arr[i%n]>arr[st.peek()]) {
				ans[st.pop()]=arr[i%n];
			}
			st.push(i%n);
		}
		while(!st.isEmpty() ) {
            int idx=st.pop();
            if(ans[idx]==null){
                ans[idx]=-1;
            }
		}
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ans[i];
        }

        return res;
	}

}
