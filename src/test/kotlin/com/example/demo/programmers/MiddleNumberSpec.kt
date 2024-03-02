package com.example.demo.programmers

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MiddleNumberSpec : DescribeSpec({
    it(".solution") {
        val result = MiddleNumber().solution(intArrayOf(1, 2, 7, 10, 11))
        result.shouldBe(7)
    }

    it(".solution") {
        val result = MiddleNumber().solution(intArrayOf(9, -1, 0))
        result.shouldBe(0)
    }
})