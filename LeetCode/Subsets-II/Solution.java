1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ss=new ArrayList<>();
5        ss.add(new ArrayList<>());
6        int s=0;
7        int e=0;
8        for(int i=0;i<nums.length;i++)
9        {
10            s=0;
11            if(i>0 && nums[i]==nums[i-1])
12            {
13            s=e;
14        }
15        e=ss.size();
16        
17            for(int j=s;j<e;j++)
18            {
19                List<Integer> sub=new ArrayList<>(ss.get(j));
20                sub.add(nums[i]);
21                ss.add(sub);
22            }
23        }
24        return ss;
25    }
26}