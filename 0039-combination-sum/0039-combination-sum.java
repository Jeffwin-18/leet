class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curnums = new ArrayList<>();
        backtrack(0, candidates, target, curnums, res);
        return res;
    }

    private void backtrack(int start, int[] candidates, int remainingTarget, List<Integer> curnums, List<List<Integer>> res) {
        // Base case
        if (remainingTarget == 0) {
            res.add(new ArrayList<>(curnums));
            return;
        }

        // Base case
        if (remainingTarget < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            curnums.add(candidates[i]);
            // Backtrack
            backtrack(i, candidates, remainingTarget - candidates[i], curnums, res);
            curnums.remove(curnums.size() - 1); 
        }
    }
}