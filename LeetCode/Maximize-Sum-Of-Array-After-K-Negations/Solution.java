1class Solution {
2    public int largestSumAfterKNegations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int sum=0;
5        int n=nums.length;
6        int i=0;
7        while(i<k)
8        {
9            //if(nums[0]==0) continue;
10            
11            nums[0]=nums[0]*-1;
12            Arrays.sort(nums);
13            i++;
14        }
15        for(int j=0;j<n;j++)
16        {
17            sum+=nums[j];
18        }
19        return sum;
20    }
21}