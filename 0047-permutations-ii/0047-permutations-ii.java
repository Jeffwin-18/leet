class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) { 
        boolean [] numused=new boolean[nums.length];
        List<Integer> curnums=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();
        backtrack(nums,curnums,numused,ans);
        return new ArrayList<>(ans);
    }

    private void backtrack(int[] nums,List<Integer> curnums, boolean [] numused, Set<List<Integer>> ans)
    {
        if(curnums.size()==nums.length)
        {
            ans.add(new ArrayList<>(curnums));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(numused[i])
            {
                continue;
            }
            curnums.add(nums[i]);
            numused[i]=true;

            backtrack(nums,curnums,numused,ans);
            //undo

            curnums.remove(curnums.size()-1);
            numused[i]=false;
        }
    }
}
