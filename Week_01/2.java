#1.给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

class Solution {
     public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target-nums[i])) {
               return new int[]{map.get(target-nums[i]),i};
           }
           map.put(nums[i],i);
       }
       return null;
    }
