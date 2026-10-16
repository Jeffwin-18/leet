class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        int mask = 0;
        
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            
            for (int num : nums) {
                set.add(num & mask);
            }
            
            int tm = max | (1 << i);
            for (int p : set) {
                if (set.contains(p ^ tm)) {
                    max = tm;
                    break;
                }
            }
        }
        
        return max;
    }
}