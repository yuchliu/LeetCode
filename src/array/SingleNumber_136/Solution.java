package array.SingleNumber_136;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i: nums)
            result ^= i;
        return result;
    }
}