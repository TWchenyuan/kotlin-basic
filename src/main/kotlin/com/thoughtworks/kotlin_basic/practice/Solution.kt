package com.thoughtworks.kotlin_basic.practice

class Solution {
    fun transform(index: Int, size: Int): List<String> {
        if (isInValidInput(index, size)) throw IllegalArgumentException()
        val a = (index..<index + size).map {
            var current = it - 1
            var result = ""
            while (true) {
                if (current < 0) break
                if (current < 26) {
                    result = current.toASCIICode() + result
                    break
                } else {
                    val nextCurrent = current / 26
                    val reminder = current % 26
                    result = reminder.toASCIICode() + result
                    current = nextCurrent - 1
                }
            }
            result
        }
        return a
    }

    private fun isInValidInput(index: Int, size: Int): Boolean =
        index >= 18279 || size >= 18279 || (index + size - 1) >= 18279 || index <= 0 || size <= 0
}

fun Int.toASCIICode(): String {
    return (this + 65).toChar().toString()
}
