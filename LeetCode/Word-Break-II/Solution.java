1class Solution {
2    public List<String> wordBreak(String s, List<String> wordDict) {
3        String ans=" ";
4        List<String> res= new ArrayList<>();
5        solve(s,ans,wordDict,res);
6        return res;
7    }
8    private void solve(String str, String ans, List<String> dict, List<String> res)
9    {
10        if(str.length()==0)
11        {
12            res.add(ans.trim());
13        }
14        for(int i=0;i<str.length();i++)
15        {
16            String left=str.substring(0,i+1);
17            if(dict.contains(left))
18            {
19                String right=str.substring(i+1);
20                solve(right,ans+left+" ",dict,res);
21            }
22        }
23    }
24}