class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
                ans = end;
            }
        }
        return ans + 1;
    }
}