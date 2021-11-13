package com.example.demo.programmers

class MakePrime {
    fun solution(nums: IntArray): Int {
        var answer = 0
        nums.sort()
        for (i in 0 until (nums.size - 2)) {
            for (j in (i + 1) until (nums.size-1)) {
                for (k in (j + 1) until nums.size) {
                    if(isPrime(nums[i] + nums[j] + nums[k])) answer++
                }
            }
        }
        return answer
    }

    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        val sqrt = Math.sqrt(num.toDouble())
        for (i in 2..sqrt.toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}