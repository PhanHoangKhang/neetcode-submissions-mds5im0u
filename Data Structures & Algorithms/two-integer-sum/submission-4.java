class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];

            if(map.containsKey(gap) && map.get(gap) != i) {
                return new int[]{i, map.get(gap)};
            }
        }
        return new int[0];
    }
}
