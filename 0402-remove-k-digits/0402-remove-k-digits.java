class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==1) return "0";
        StringBuilder result = new StringBuilder();
        for(char c : num.toCharArray()){
            while(k>0 && result.length()>0 && result.charAt(result.length()-1) > c){
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(c);
        }
        result.setLength(result.length()-k);
        int i = 0;
        while(i < result.length() && result.charAt(i) == '0'){
            i++;
        }
        String res = result.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}