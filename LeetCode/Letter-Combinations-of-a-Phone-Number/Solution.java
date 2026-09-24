1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> res=new ArrayList<>();
4        String [] ph={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
5        StringBuilder curr=new StringBuilder();
6        backtrack(digits,0,res,ph,curr);
7        return res;
8    }
9    private void backtrack(String digits, int in, List<String> res, String[] ph, StringBuilder curr)
10    {
11        if(in==digits.length())
12        {
13            res.add(curr.toString());
14            return;
15        }
16        int digit=digits.charAt(in)-'0';
17        String let=ph[digit];
18        for(char c:let.toCharArray())
19        {
20            curr.append(c);
21            backtrack(digits,in+1,res,ph,curr);
22            curr.deleteCharAt(curr.length()-1);
23        }
24    }
25}