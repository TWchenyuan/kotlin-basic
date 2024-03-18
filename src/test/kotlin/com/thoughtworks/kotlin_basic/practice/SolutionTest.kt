package com.thoughtworks.kotlin_basic.practice

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    val solution = Solution()
    @Test
    fun `should get A when input (1,1)`() {
        assertContentEquals(listOf("A"), solution.transform(1, 1))
    }

    @Test
    fun `should get the corresponding letter A-Z when input any sequence of 1-26 and the size is 1`() {
        assertContentEquals(listOf("B"), solution.transform(2, 1))
        assertContentEquals(listOf("G"), solution.transform(7, 1))
        assertContentEquals(listOf("X"), solution.transform(24, 1))
        assertContentEquals(listOf("Z"), solution.transform(26, 1))
    }

    @Test
    fun `should get x letter when input any sequence of 1-26 and size is x`() {
        assertContentEquals(listOf("B", "C", "D"), solution.transform(2, 3))
        assertContentEquals(listOf("X", "Y"), solution.transform(24, 2))
    }
}