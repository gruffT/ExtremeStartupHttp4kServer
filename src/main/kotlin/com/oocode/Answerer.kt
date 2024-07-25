package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        if (question == "What is your name?") {
            return "GT"
        } else if (question.contains("plus")) {
            return question.split("plus").map { it.filter { it.isDigit() }.toInt() }
                .sum()
                .toString()
        } else if (question.contains("multiplied")) {
            return question.split("multiplied").map { it.filter { it.isDigit() }.toInt() }
                .fold(1) { acc, i -> acc * i }
                .toString()
        } else if (question.contains("minus")) {
            return question.split("minus").map { it.filter { it.isDigit() }.toInt() }
                .reduce { acc, i -> acc - i }
                .toString()
        } else if (question.contains("largest")) {
            return question.split(":")[1]
                .filter { it.isDigit() || it == ',' }
                .split(",")
                .map { it.toInt() }
                .max()
                .toString()
        } else {
            return "Argh Pirates"
        }
    }
}