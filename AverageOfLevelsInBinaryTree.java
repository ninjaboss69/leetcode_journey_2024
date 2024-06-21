class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        Queue<TreeNode> process = new LinkedList();
        DecimalFormat df = new DecimalFormat("#.00000");
        queue.add(root);
        List<Double> ans = new ArrayList();
        while (!queue.isEmpty()) {

            double average = 0;
            int count = 0;

            while (!queue.isEmpty()) {

                TreeNode current = queue.poll();

                average += current.val;
                count++;
                if (current.left != null) {
                    process.add(current.left);
                }
                if (current.right != null) {
                    process.add(current.right);
                }

            }
            double a = average / count;
            ans.add(Double.parseDouble(df.format(a)));
            count = 0;
            average = 0;
            queue.clear();
            queue.addAll(process);
            process.clear();

        }
        return ans;
    }

}