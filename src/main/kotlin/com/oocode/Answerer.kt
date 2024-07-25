package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        if (question == "What is your name?") {
            return "GT"
        } else if (question.contains("plus")) {
            return question.filter { it.isDigit() }
                .windowed(2, 2)
                .map { it.toInt() }
                .sum()
                .toString()
        } else {
            return "Argh Pirates"
        }
    }
}