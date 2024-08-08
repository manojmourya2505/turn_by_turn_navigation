package com.inouiw.scrutiny

import com.inouiw.scrutiny.utils.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var mCalculatorInstance: Calculator

    @Before
    fun setUp() {
        mCalculatorInstance = Calculator()
    }

    @Test
    fun testAdd() {
        val result = mCalculatorInstance.additionOfTwoNumbers(2, 3)
        assertEquals(5, result)
    }
}