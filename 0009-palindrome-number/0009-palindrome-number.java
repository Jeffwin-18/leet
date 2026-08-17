class Solution {
    public boolean isPalindrome(int x) {
       int r=0;
       int x1=x;
       while(x>0)
       {
        int d=x%10;
        r=(r*10)+d;
        x=x/10;
       } 
       if(r==x1)
       {
        return true;
       }
       else
       return false;
    }
}