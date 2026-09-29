1class Solution {
2    public int[][] reconstructQueue(int[][] people) {
3        Arrays.sort(people, (a, b) -> a[0] != b[0] ? Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1]));
4
5        List<int[]> result=new ArrayList<>();
6        for(int [] p:people)
7        {
8            result.add(p[1],p);
9        }
10        return result.toArray(new int [people.length][]);
11    }
12}