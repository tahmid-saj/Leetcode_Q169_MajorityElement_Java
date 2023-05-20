class Solution {
    public int majorityElement(int[] nums) {
        int timesAppr = 0;
        int numAppr = 0;
        int ret = 0;

        Arrays.sort(nums);

        // Loop through nums using i
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                numAppr = nums[0];
            } else if (i > 0 && nums[i] != nums[i - 1]) {
                numAppr = nums[i];
                timesAppr = 0;
            }

            timesAppr++;

            if (timesAppr > (nums.length / 2)) {
                ret = numAppr;
                break;
            }

        }

        return ret;
    }
}
