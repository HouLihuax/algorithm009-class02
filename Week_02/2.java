#前K个高频元素
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num , map.getOrDefault(num,0)+1);
        }
        Queue<Integer> pq = new PriorityQueue<>((v1,v2) -> map.get(v1) - map.get(v2));
        for (int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int []a = new int[k];
        int i = 0;
        for (int num : pq) {
            a[i++] = num;
        }
        return a;
    }
}
