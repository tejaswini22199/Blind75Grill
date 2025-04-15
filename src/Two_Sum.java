import java.util.HashMap;

// brute force - O(n^2) - Time and O(1) - space
// hashMap - O(n) time and O(n) - space

class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int length = nums.length;

        for(int i = 0; i < length; i++) {
            if(hashMap.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = hashMap.get(target-nums[i]);
                return result;
            }
            hashMap.put(nums[i], i);
        }
        return result;
    }
}