package com.example.demo.programmers

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MakePrimeSpec: DescribeSpec() {
    val makePrime = MakePrime()
    init {
        it(".solution") {
            makePrime.solution(intArrayOf(1,2,3,4)).shouldBe(1)
            makePrime.solution(intArrayOf(1,2,7,6,4)).shouldBe(4)
        }
    }
}