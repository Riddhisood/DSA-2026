// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashMap
// Time: O(n), Space: O(n)

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }