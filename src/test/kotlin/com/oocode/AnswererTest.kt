package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class AnswererTest {
    @Test
    fun canAnswerMyName() {
        val contents = Answerer().answerFor("What is your name?")
        assertThat(contents, equalTo("GT"))
    }

    @Test
    fun canAnswer5Multiply10() {
        val contents = Answerer().answerFor("What is 99 multiplied by 6?")
        assertThat(contents, equalTo("594"))
    }

    @Test
    fun canAnswer99Minus6() {
        val contents = Answerer().answerFor("What is 99 minus 6?")
        assertThat(contents, equalTo("93"))
    }

    @Test
    fun canAnswer1Plus2Plus3() {
        val contents = Answerer().answerFor("What is 1 plus 2 plus 3?")
        assertThat(contents, equalTo("6"))
    }

    @Test
    fun canAnswerPower() {
        val contents = Answerer().answerFor("What is 3 to the power of 2?")
        assertThat(contents, equalTo("9"))
    }
    @Test
    fun canAnswerPrime() {
        val contents = Answerer().answerFor("Which of the following numbers are primes: 63, 68, 8, 39, 17?")
        assertThat(contents, equalTo("17"))
    }
}
