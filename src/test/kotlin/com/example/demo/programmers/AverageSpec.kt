package com.example.demo.programmers

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class AverageSpec: DescribeSpec({

    it(".solution") {
        val result = Average().solution(intArrayOf(1,2,3,4))
        result.shouldBe(2.5)
    }

    it(".solution2") {
        val result = Average().solution(intArrayOf(5,5))
        result.shouldBe(5)
    }
})