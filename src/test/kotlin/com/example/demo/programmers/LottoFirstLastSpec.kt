package com.example.demo.programmers

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class LottoFirstLastSpec : DescribeSpec() {
    val lottoFirstLast = LottoFirstLast()

    init {
        it(".solution") {
            lottoFirstLast.solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)).shouldBe(intArrayOf(3, 5))
            lottoFirstLast.solution(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25)).shouldBe(intArrayOf(1, 6))
            lottoFirstLast.solution(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35)).shouldBe(intArrayOf(1, 1))
            lottoFirstLast.solution(intArrayOf(1,2,3,4,5,6), intArrayOf(7,8,9,10,11,12)).shouldBe(intArrayOf(6, 6))
        }
    }

}