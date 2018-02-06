package _20180206;

public class Q20180206 {

	public static void main(String[] args) {
		int[] arr1 = {4, 7, 2, 9};
		
		Solution q = new Solution();
		System.out.println(q.result(arr1, 11));
		System.out.println(q.result(arr1, 6));
		System.out.println(q.result(arr1, 13));
		System.out.println(q.result(arr1, 9));

	}
}

class Solution {
	public String result(int[] nums, int target){
		int var1 =0, var2 = 0;
		boolean chk = false;
		
		for(int i=0; i<nums.length; i++){
			for(int j=1; j<nums.length; j++){
				if((nums[i]+nums[j]) == target){
					var1 = i;
					var2 = j;
					chk = true;
					break;
				}
			}
			if(chk){
				break;
			}
		}
		
		return "["+var1+","+var2+"]";
	}
}