package com.example.demo.leetcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class TwoSumSpec : DescribeSpec({
    describe("twoSum") {
        withData(
            Triple(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            Triple(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            Triple(intArrayOf(3, 3), 6, intArrayOf(0, 1))
        ) {
            TwoSum().twoSum(it.first, it.second).shouldBe(it.third)
        }
    }
})
