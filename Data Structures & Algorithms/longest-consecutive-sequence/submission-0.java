class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> storeArray = new HashSet<>();
        int currentLongest = 0;

        for (int num: nums) {
            storeArray.add(num);
        }

        for (int num: nums) {
            int streak = 0;
            int curr = num;

            while (storeArray.contains(curr)) {
                streak++;
                curr++;
            }

            currentLongest = Math.max(currentLongest, streak);
        }

        return currentLongest;
    }
}
