1class Solution {
2    public int smallestDistancePair(int[] nums, int k) {
3        java.util.Arrays.sort(nums);
4        int minDist = 0;
5        int maxDist = nums[nums.length - 1] - nums[0];
6        
7        while(minDist <= maxDist) {
8            int midDist = minDist + (maxDist - minDist) / 2;
9            int left = 0;
10            int right = 0;
11            int count = 0;
12            
13            while(right < nums.length) {
14                if(nums[right] - nums[left] > midDist) {
15                    left++;
16                } else {
17                    count += right - left;
18                    right++;
19                }
20            }
21            
22            if(count >= k) {
23                maxDist = midDist - 1;
24            } else {
25                minDist = midDist + 1;
26            }
27        }
28        return minDist;
29    }
30}