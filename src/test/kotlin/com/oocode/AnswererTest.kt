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
}
