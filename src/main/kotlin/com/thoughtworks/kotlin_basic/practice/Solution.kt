package com.thoughtworks.kotlin_basic.practice

class Solution {
    fun transform(index: Int, size: Int): List<String> {
        return listOf((index+64).toChar().toString())
    }
}