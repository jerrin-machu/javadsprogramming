
public class Sample {

	public static int[] twoNumberSum(int arr[],int target) {
		for(int i = 0; i<arr.length-1;i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					return new int [] {arr[i],arr[j]};
				}
			}
		}
		
		return new int[0];
	}
	
	public static void main(String args[]) {
		int[] nums = {6,5,7,9,4,0,2};
		int target = 10;
		int [] result = twoNumberSum(nums,target);
		for(int k = 0; k<result.length; k++) {
			System.out.println(result[k]);
		}
	}
}
