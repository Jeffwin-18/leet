class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String [] ph={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder curr=new StringBuilder();
        backtrack(digits,0,res,ph,curr);
        return res;
    }
    private void backtrack(String digits, int in, List<String> res, String[] ph, StringBuilder curr)
    {
        if(in==digits.length())
        {
            res.add(curr.toString());
            return;
        }
        int digit=digits.charAt(in)-'0';
        String let=ph[digit];
        for(char c:let.toCharArray())
        {
            curr.append(c);
            backtrack(digits,in+1,res,ph,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}