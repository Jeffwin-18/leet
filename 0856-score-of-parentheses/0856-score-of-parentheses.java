class Solution {
    public int scoreOfParentheses(String s) {
        int so=0;
        int d=0;
        int l=s.length();
        char []c=s.toCharArray();
        for( int i=0;i<l;i++)
        {
            if(c[i]=='(')
            {
                d++;
            }
           else
            {
                d--;
            
            if(c[i]==')' && c[i-1]=='(')
            {
                so=so+((int)Math.pow(2,d));
            }}
        }
        return so;
    }
}