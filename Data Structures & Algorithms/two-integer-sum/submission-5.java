
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int left = 0;
        int right = nums.length-1;
        while(left < right)
        {
            int sum = (arr[left][0]+arr[right][0]);
            if(sum < target)
            {
                left++;
            }
            else if( sum == target)
            {
                // int i = arr[left][1];
                return new int[] {Math.min(arr[left][1],arr[right][1]),Math.max(arr[left][1],arr[right][1])};
            }
            else if(sum>target)
            {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}