package week2;

import java.util.*;

public class LC_496_NGE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		int nums1[]= {4,1,2};
		int nums2[]= {1,3,4,2};
		int res[]=nextGreaterElement(nums1,nums2);
		for(int x:res) {
			System.out.print(x+" ");
		}
	}
	static int [] ans;
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        NGE(nums2);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ans[i]);
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;

    }
    public static void NGE(int []arr) {
        ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<ans.length;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
	}

}
