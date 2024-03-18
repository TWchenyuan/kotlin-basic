package com.thoughtworks.kotlin_basic.practice

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    val solution = Solution()
    @Test
    fun `should get A when input (1,1)`() {
        assertContentEquals(listOf("A"), solution.transform(1, 1))
    }
}