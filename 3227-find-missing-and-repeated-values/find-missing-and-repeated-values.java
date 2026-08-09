class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashSet<Integer> list = new HashSet<>();

        int sum = 0;
        int a = -1;

        int n = grid.length;
        int total = n * n;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                sum += grid[i][j];

                if (list.contains(grid[i][j])) {
                    a = grid[i][j];
                    sum -= grid[i][j];
                }

                list.add(grid[i][j]);
            }
        }

        int ans = total * (total + 1) / 2;
        int p = ans - sum;

        return new int[]{a, p};
    }
}

