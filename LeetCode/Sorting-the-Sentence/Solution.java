1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] result = new String[words.length];
5        for(String str : words){
6            int position = str.charAt(str.length()-1)-'0';
7            result[position-1] = str.substring(0, str.length()-1); 
8        }
9        return String.join(" ", result);
10    }
11}