package com.thoughtworks.kotlin_basic.practice

class Solution {
    fun transform(index: Int, size: Int): List<String> {
        if (index >= 18279 || size >= 18279 || (index + size - 1) >= 18279) throw IllegalArgumentException()
        return (index..<index + size).map {
            it.toASCIICode()
        }
    }
}

fun Int.toASCIICode(): String {
    return (this + 64).toChar().toString()
}
