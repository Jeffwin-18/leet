1class Solution {
2    public int[] sortArray(int[] nums) {
3        int n=nums.length;
4        int mid=n/2;
5        int []left=new int [mid];
6        int [] right=new int[n-mid];
7        if(nums.length<=1)
8        {
9            return nums;
10        }
11        System.arraycopy(nums,0,left,0,mid);
12        System.arraycopy(nums,mid,right,0,n-mid);
13
14        sortArray(left);
15        sortArray(right);
16        merge(nums,left,right);
17
18        return nums;
19    }
20    public static void merge(int []  num, int []left,int []right)
21    {
22        int i=0,j=0,k=0;
23        while(i<left.length && j<right.length)
24        {
25            if(left[i]<right[j])
26            {
27                num[k++]=left[i++];
28            }
29        
30            else
31            {
32                num[k++]=right[j++];
33            }
34        }
35            while(i<left.length)
36            {
37                num[k++]=left[i++];
38            }
39            while(j<right.length)
40            {
41                num[k++]=right[j++];
42            }
43        
44    }
45}