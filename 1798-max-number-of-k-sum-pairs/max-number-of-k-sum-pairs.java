class Solution {
    public int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : nums) {

          
            if (map.getOrDefault(num, 0) == 0)
                continue;

            int target = k - num;

            if (map.getOrDefault(target, 0) == 0)
                continue;

            
            if (num == target && map.get(num) < 2)
                continue;

            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0)
                map.remove(num);

           
            map.put(target, map.get(target) - 1);
            if (map.get(target) == 0)
                map.remove(target);

            count++;
        }

        return count;
    }
}