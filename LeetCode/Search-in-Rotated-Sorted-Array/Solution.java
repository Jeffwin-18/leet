1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        int mid=0;
6        
7
8        while(l<=r)
9        {
10            mid=l+(r-l)/2;
11            if(nums[mid]== target) 
12            return mid;
13            
14            if(nums[l]<=nums[mid])
15            {
16                if(nums[l]<=target && target <nums[mid])
17                {
18                r=mid-1;
19                }
20            
21            else
22            {
23                l=mid+1;
24            }
25        }
26        else
27        {
28            if (nums[mid]<target && target<=nums[r])
29            {
30                l=mid+1;
31            }
32            else
33            {
34                r=mid-1;
35            }
36        }
37        }
38        return -1;
39    }
40}