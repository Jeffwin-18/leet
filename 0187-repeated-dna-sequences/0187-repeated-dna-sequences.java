class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> se=new HashSet<>();
        Set<String> re=new HashSet<>();
        int l=s.length();
        for(int i=0;i<=l-10;i++)
        {
            String seq=s.substring(i,i+10);
            if(!se.add(seq))
            {
                re.add(seq);

            }
        }
        return new ArrayList <>(re);
    }
}