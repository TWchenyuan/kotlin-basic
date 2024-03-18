package com.thoughtworks.kotlin_basic.practice

class Solution {
    fun transform(index: Int, size: Int): List<String> {
        return (index..<index + size).map {
            it.toASCIICode()
        }
    }
}

fun Int.toASCIICode(): String {
    return (this + 64).toChar().toString()
}
