class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curnums = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, curnums, res);
        return res;
    }

    private void backtrack(int start, int[] candidates, int remainingTarget, List<Integer> curnums, List<List<Integer>> res) {
        if (remainingTarget == 0) {
            res.add(new ArrayList<>(curnums));
            return;
        }
        

        for (int i = start; i < candidates.length; i++) {
            if(candidates[i]>remainingTarget) break;

            if(i>start && candidates[i]==candidates[i-1]) continue;

            curnums.add(candidates[i]);
            backtrack(i+1, candidates, remainingTarget - candidates[i], curnums, res);
            curnums.remove(curnums.size() - 1); // Backtrack
        }
    }
}