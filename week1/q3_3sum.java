package week1;

import java.util.*;

public class q3_3sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<List<Integer>> ans=threeSum(arr);
		

	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				if(sum==0) {
					
					ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
					while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
					j++;
					k--;
				}
				else if(sum>0) {
					k--;
				}
				else {
					j++;
				}
			}	
		}
		return ans;
	}

}
