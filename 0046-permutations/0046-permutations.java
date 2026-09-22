class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> curnums=new ArrayList<>();
        boolean [] numused=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numused[i]=false;
        }
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,curnums,numused,ans);
        return ans;
    }

    private void backtrack(int[] nums,List<Integer> curnums, boolean [] numused, List<List<Integer>> ans)
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