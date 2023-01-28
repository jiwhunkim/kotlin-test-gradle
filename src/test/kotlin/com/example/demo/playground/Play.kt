package com.example.demo.playground

import io.kotest.core.spec.style.DescribeSpec
import java.util.stream.Collectors

class Play: DescribeSpec() {
    init {
        it("hello") {
            val a = listOf(1L, 2L, 2L, 3L, 4L).stream().distinct().collect(Collectors.toList())
            println(a)

            val b = HelloWorld(a = 1, b = 2, c =3)
            val c = HelloWorld(b = 33, c = 4)
            println(b)
        }
    }
}