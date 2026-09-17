1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        Set<String> se=new HashSet<>();
4        Set<String> re=new HashSet<>();
5        int l=s.length();
6        for(int i=0;i<=l-10;i++)
7        {
8            String seq=s.substring(i,i+10);
9            if(!se.add(seq))
10            {
11                re.add(seq);
12
13            }
14        }
15        return new ArrayList <>(re);
16    }
17}