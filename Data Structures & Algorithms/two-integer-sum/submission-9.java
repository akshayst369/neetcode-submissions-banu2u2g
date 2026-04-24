class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapa = new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            int complement = target - nums[i];
                if(mapa.containsKey(complement))
                {
                    return new int[]{mapa.get(complement),i};
                }
                mapa.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
    }
}
