1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) { 
3        boolean [] numused=new boolean[nums.length];
4        List<Integer> curnums=new ArrayList<>();
5        Set<List<Integer>> ans=new HashSet<>();
6        backtrack(nums,curnums,numused,ans);
7        return new ArrayList<>(ans);
8    }
9
10    private void backtrack(int[] nums,List<Integer> curnums, boolean [] numused, Set<List<Integer>> ans)
11    {
12        if(curnums.size()==nums.length)
13        {
14            ans.add(new ArrayList<>(curnums));
15            return ;
16        }
17        for(int i=0;i<nums.length;i++)
18        {
19            if(numused[i])
20            {
21                continue;
22            }
23            curnums.add(nums[i]);
24            numused[i]=true;
25
26            backtrack(nums,curnums,numused,ans);
27            //undo
28
29            curnums.remove(curnums.size()-1);
30            numused[i]=false;
31        }
32    }
33}
34