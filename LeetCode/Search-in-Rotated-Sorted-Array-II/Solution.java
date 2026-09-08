1class Solution {
2    public boolean search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        int mid=0;
6
7        
8
9        while(l<=r)
10        {
11            mid=l+(r-l)/2;
12            if(nums[mid]==target)
13            return true;
14
15            if(nums[l]==nums[mid] && nums[mid]==nums[r])
16            {
17            l++;
18            r--;
19            continue;
20            }
21          
22            if(nums[l]<=nums[mid])
23            {
24                if(nums[l]<=target && target<nums[mid])
25                {
26                    r=mid-1;
27                }
28                else
29                {
30                    l=mid+1;
31                }
32            }
33            else
34            {
35                if(nums[mid]<target && target<=nums[r])
36                {
37                    l=mid+1;
38                }
39                else
40                {
41                    r=mid-1;
42                }
43            }
44           
45        }
46         return false;
47    }
48}