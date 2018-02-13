package _PivotIndex;

public class PivotIndex {

	public static void main(String[] args) {
		int[] arr1 = {1, 7, 3, 6, 5, 6};
		int[] arr2 = {1, 2, 3};
		int[] arr3 = {2, 3};
		
		Solution q = new Solution();
			
		System.out.println(q.findIndex(arr1));
		System.out.println(q.findIndex(arr2));
		System.out.println(q.findIndex(arr3));

	}

}

class Solution {
	
	public int findIndex(int[] findNums){
		int find = -1;
		
		for(int i=0; i<findNums.length; i++){
			find = result(findNums, i);
			if(find > 0){
				break;
			}
		}
		
		return find;
	}
	
	private int result(int[] nums, int target){
		int var1 =0, var2 = 0;
		
		if(exceptionCheck(nums, target)){
			return -1;
		}
		
		for(int i=0; i<target; i++){
			var1 += nums[i];
		}
		
		for(int j=nums.length-1; j>target; j--){
			var2 += nums[j];
		}
		
		if(var1 == var2)
			return target;
		else 
			return -1;
		
	}
	
	private boolean exceptionCheck(int[] checkArr, int checkNum){
		if(checkArr.length < 3){
			return true;
		}
		
		if((checkNum < 0) || (checkNum > checkArr.length)){
			return true;
		}
		
		return false;
	}
}