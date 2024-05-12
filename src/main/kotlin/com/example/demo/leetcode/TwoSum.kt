package com.example.demo.leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                return intArrayOf(map.get(target - nums[i])!!, i)
            } else {
                map.put(nums[i], i)
            }
        }
        return intArrayOf()
    }
}