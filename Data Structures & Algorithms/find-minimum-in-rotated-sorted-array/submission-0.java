class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // if the array is not rotated, the min value will be at index 0
        if (nums[left] < nums[right]) {
            return nums[0];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // When left = right, we get the min value
        return nums[left];
    }
}
