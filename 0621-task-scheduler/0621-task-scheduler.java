class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] fr=new int[26];
        for( char i:tasks)
        {
            fr[i-'A']++;
        }
        Arrays.sort(fr);
        int mf=fr[25];
        int mc=0;
        for(int i=25;i>=0;i--)
        {
            if(fr[i]==mf)
            {
                mc++;
            }
            else
            {
                break;
            }
        }
        int min=(mf-1)*(n+1)+mc;
        return Math.max(tasks.length, min);
    }
}