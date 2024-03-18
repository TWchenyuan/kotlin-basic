package com.thoughtworks.kotlin_basic.practice

class Solution {
    fun transform(index: Int, size: Int): List<String> {
        if (isInValidInput(index, size)) throw IllegalArgumentException()
        return (index..<index + size).map {
            it.toASCIICode()
        }
    }

    private fun isInValidInput(index: Int, size: Int): Boolean =
        index >= 18279 || size >= 18279 || (index + size - 1) >= 18279 || index <= 0 || size <= 0
}

fun Int.toASCIICode(): String {
    return (this + 64).toChar().toString()
}
