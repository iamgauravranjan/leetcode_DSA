import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : nums) {

            if (!map.containsKey(num))
                continue;

            int target = k - num;

         
            if (!map.containsKey(target))
                continue;

            if (num == target) {

              
                if (map.get(num) < 2)
                    continue;

                map.put(num, map.get(num) - 2);

                if (map.get(num) == 0)
                    map.remove(num);

            } else {

              
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0)
                    map.remove(num);

                map.put(target, map.get(target) - 1);
                if (map.containsKey(target) && map.get(target) == 0)
                    map.remove(target);
            }

            count++;
        }

        return count;
    }
}