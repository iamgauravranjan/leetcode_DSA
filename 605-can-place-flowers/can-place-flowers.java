class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {

        if(n==0){
            return true;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                continue;
            } else {
                if (i == 0) {
                    if (i + 1 == nums.length || nums[i + 1] == 0) {
                        n--;
                        nums[i] = 1;
                    }
                } else if (i == nums.length - 1) {
                    if (nums[i - 1] == 0) {
                        n--;
                        nums[i] = 1;
                    }
                } else {
                    if (nums[i - 1] == 0 && nums[i + 1] == 0) {
                        n--;
                        nums[i] = 1;
                    }
                }
            }

            if (n == 0)
                return true;
        }

        return false;
    }
}