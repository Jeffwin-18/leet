class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curnums=new ArrayList<>();
        backtrack(1,n,k,curnums,res);
        return res;
        
    }
    
        private void backtrack(int start, int n, int k, List<Integer> curnums,List<List<Integer>> res)
        {
            //base case
            if(curnums.size()==k)
            {
                res.add(new ArrayList<>(curnums));
                return;
            }
            //choose

            for(int i=start;i<=n;i++)
            {
                curnums.add(i);
                backtrack(i+1,n,k,curnums,res);
                //undo
                curnums.remove(curnums.size()-1);
            }
        }
    
}