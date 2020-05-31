#N叉树的层序遍历
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root != null) traverseNode(root,0);
        return result;
    }
    public void traverseNode(Node node,int level) {
        if (result.size() <= level) {
            result.add(new ArrayList());
        }
        result.get(level).add(node.val);
        for (Node child : node.children) {
            traverseNode(child,level+1);
        }
    }
}
