class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target);
    }

    public boolean binarySearch(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        for (int i = 0; i < m; i++) {
            if (target >= nums[i][0] && target <= nums[i][n - 1]) {
                int low = 0;
                int high = n - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (nums[i][mid] == target) {
                        return true;
                    } else if (nums[i][mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            } else if (target < nums[i][0]) {
                return false;
            }
        }
        return false;
    }
}

