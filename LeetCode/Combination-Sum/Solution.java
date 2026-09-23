1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> curnums = new ArrayList<>();
5        backtrack(0, candidates, target, curnums, res);
6        return res;
7    }
8
9    private void backtrack(int start, int[] candidates, int remainingTarget, List<Integer> curnums, List<List<Integer>> res) {
10        // Base case
11        if (remainingTarget == 0) {
12            res.add(new ArrayList<>(curnums));
13            return;
14        }
15
16        // Base case
17        if (remainingTarget < 0) {
18            return;
19        }
20
21        for (int i = start; i < candidates.length; i++) {
22            curnums.add(candidates[i]);
23            // Backtrack
24            backtrack(i, candidates, remainingTarget - candidates[i], curnums, res);
25            curnums.remove(curnums.size() - 1); 
26        }
27    }
28}