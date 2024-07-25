package com.oocode

import java.lang.Math.pow

class Answerer {
    val listOfPrimes =
        "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97".split(", ")
            .map { it.toInt() }

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
        } else if (question.contains("power")) {
            return question.split("power").map { it.filter { it.isDigit() }.toInt() }
                .map { it.toDouble() }
                .reduce { acc, i -> pow(acc, i) }
                .toLong().toString()
        } else if (question.contains("largest")) {
            return question.split(":")[1]
                .filter { it.isDigit() || it == ',' }
                .split(",")
                .map { it.toInt() }
                .max()
                .toString()
        } else if (question.contains("primes")) {
            return question.split(":")[1]
                .filter { it.isDigit() || it == ',' }
                .split(",")
                .map { it.toInt() }
                .filter { listOfPrimes.contains(it) }
                .joinToString(", ")
        } else {
            return "Argh Pirates"
        }
    }
}