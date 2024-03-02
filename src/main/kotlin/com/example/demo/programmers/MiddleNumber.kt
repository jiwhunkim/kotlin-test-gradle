package com.example.demo.programmers

class MiddleNumber {
    fun solution(array: IntArray): Int {
        val sorted = array.sorted()
        val middle = sorted.count() / 2
        return sorted[middle]
    }
}