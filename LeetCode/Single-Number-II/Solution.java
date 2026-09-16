1class Solution {
2    public int singleNumber(int[] nums) {
3        int r = 0;
4        for (int i = 0; i < 32; i++) {
5            int bc = 0;
6
7            for (int j : nums) {
8                if ((j & (1 << i)) != 0)
9
10                {
11                    bc++;
12                }
13            }
14
15            if (bc % 3 != 0) {
16                r = r | (1 << i);
17            }
18        }
19        return r;
20    }
21}