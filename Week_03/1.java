#括号生成
class Solution {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        _generate(0, 0, n, "");
        return list;
    }

    private void _generate(int left, int right, int n, String s)    {
        if (left == n && right ==n) {
            list.add(s);
        }
        if (left < n) _generate(left+1, right, n, s+"(");
        if (right < left) _generate(left,right+1, n, s+")");
    }

}
