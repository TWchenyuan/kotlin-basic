package com.thoughtworks.kotlin_basic.practice

import org.junit.jupiter.api.Nested
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFailsWith

class SolutionTest {
    val solution = Solution()

    @ParameterizedTest
    @MethodSource("edgeCaseProvider")
    fun illegalTest(case: Pair<Int, Int>) {
        assertFailsWith<IllegalArgumentException> {
            solution.transform(case.first, case.second)
        }
    }

    companion object {
        @JvmStatic
        fun testCaseProvider(): List<Pair<Pair<Int, Int>, List<String>>> {
            return listOf(
                Pair(1, 1) to listOf("A"),
                Pair(2, 1) to listOf("B"),
                Pair(7, 1) to listOf("G"),
                Pair(24, 1) to listOf("X"),
                Pair(26, 1) to listOf("Z"),
                Pair(2, 3) to listOf("B", "C", "D"),
                Pair(24, 4) to listOf("X", "Y", "Z", "AA"),
                Pair(27, 1) to listOf("AA"),
                Pair(28, 1) to listOf("AB"),
                Pair(18278, 1) to listOf("ZZZ"),
                Pair(18277, 2) to listOf("ZZY", "ZZZ"),
                Pair(26 * 26 * 26 + 26 * 2 + 26, 1) to listOf("ZBZ"),
                Pair(30, 11) to listOf("AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN")
            )
        }

        @JvmStatic
        fun edgeCaseProvider(): List<Pair<Int, Int>> {
            return listOf(
                18279 to 1,
                18278 to 2,
                0 to 1,
                -1 to 1,
                1 to 0,
                3 to -20,
            )
        }
    }

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    fun abstractTest(case: Pair<Pair<Int, Int>, List<String>>) {
        assertContentEquals(case.second, solution.transform(case.first.first, case.first.second))
    }

}