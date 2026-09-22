1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        
4        List<Integer> curnums=new ArrayList<>();
5        boolean [] numused=new boolean[nums.length];
6        for(int i=0;i<nums.length;i++)
7        {
8            numused[i]=false;
9        }
10        List<List<Integer>> ans=new ArrayList<>();
11        backtrack(nums,curnums,numused,ans);
12        return ans;
13    }
14
15    private void backtrack(int[] nums,List<Integer> curnums, boolean [] numused, List<List<Integer>> ans)
16    {
17        if(curnums.size()==nums.length)
18        {
19            ans.add(new ArrayList<>(curnums));
20            return ;
21
22        }
23        for(int i=0;i<nums.length;i++)
24        {
25            if(numused[i])
26            {
27                continue;
28            }
29            curnums.add(nums[i]);
30            numused[i]=true;
31
32            backtrack(nums,curnums,numused,ans);
33            //undo
34
35            curnums.remove(curnums.size()-1);
36            numused[i]=false;
37        }
38    }
39}