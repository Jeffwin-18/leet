1class Solution {
2    public List<String> generateParenthesis(int n) {
3            List<String> result = new ArrayList<>();
4            StringBuilder current = new StringBuilder();
5            backtrack(result, current, n, 0, 0);
6            return result;
7        }
8        public void backtrack(List<String> result, StringBuilder current, int n, int open, int close){
9            if(current.length() == 2*n ){
10                result.add(current.toString());
11                return;
12            }
13            if(open < n){
14                current.append('(');
15                backtrack(result, current, n, open+1, close);
16                current.deleteCharAt(current.length() - 1);
17            }
18            if(close < open){
19                current.append(')');
20                backtrack(result, current,n , open, close+1);
21                current.deleteCharAt(current.length() - 1);
22            }
23        }
24    }