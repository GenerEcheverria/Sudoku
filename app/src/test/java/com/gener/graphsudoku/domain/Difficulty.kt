package com.gener.graphsudoku.domain

enum class Difficulty(val modifier: Double) {
    EASY(.50),
    MEDIUM(.35),
    HARD(0.38)
}