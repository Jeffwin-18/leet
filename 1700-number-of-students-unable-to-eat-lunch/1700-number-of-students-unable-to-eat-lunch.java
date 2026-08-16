class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c1=0,c0=0;
        for(int i:students)
        {
            if(i==0)
            {
                c0++;
            }
            else
            {
                c1++;
            }
        }
        for(int i:sandwiches)
        {
            if(i==0)
            {
            if(c0>0)
            {
                c0--;
            }
            else
            {
                break;
            }}
            else{
            if(c1>0)
            {
                c1--;
            }
            else
            {
                break;
            }
            }
        }
        return c0+c1;
    }
}