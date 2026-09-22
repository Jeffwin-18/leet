1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res=new ArrayList<>();
4        List<Integer> curnums=new ArrayList<>();
5        backtrack(1,n,k,curnums,res);
6        return res;
7        
8    }
9    
10        private void backtrack(int start, int n, int k, List<Integer> curnums,List<List<Integer>> res)
11        {
12            //base case
13            if(curnums.size()==k)
14            {
15                res.add(new ArrayList<>(curnums));
16                return;
17            }
18            //choose
19
20            for(int i=start;i<=n;i++)
21            {
22                curnums.add(i);
23                backtrack(i+1,n,k,curnums,res);
24                //undo
25                curnums.remove(curnums.size()-1);
26            }
27        }
28    
29}