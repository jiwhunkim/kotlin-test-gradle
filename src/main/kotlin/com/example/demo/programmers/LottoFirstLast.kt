package com.example.demo.programmers

class LottoFirstLast {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var match = lottos.count { win_nums.contains(it) }
        var zero = lottos.count { it == 0 }
        return intArrayOf(calcRank(match + zero), calcRank(match))
    }

    fun calcRank(matchNum: Int): Int {
        return when (matchNum) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}