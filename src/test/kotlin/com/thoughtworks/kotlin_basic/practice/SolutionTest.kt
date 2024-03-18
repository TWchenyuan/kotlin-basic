package com.thoughtworks.kotlin_basic.practice

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFails
import kotlin.test.assertFailsWith

class SolutionTest {
    val solution = Solution()
    @Test
    fun `should get the corresponding letter A-Z when input any sequence of 1-26 and the size is 1`() {
        assertContentEquals(listOf("A"), solution.transform(1, 1))
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

    @Test
    fun `should throw exception when invalid argument`() {
        assertFailsWith<IllegalArgumentException> {
            solution.transform(18279,1)
            solution.transform(18278,2)
            solution.transform(1, 18278)
            solution.transform(0, 1)
            solution.transform(-1, 0)
            solution.transform(3, -20)
        }
    }

}