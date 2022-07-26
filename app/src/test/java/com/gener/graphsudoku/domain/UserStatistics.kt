package com.gener.graphsudoku.domain

data class UserStatistics(
    //User time results
    val fourEasy: Long = 0,
    val fourMedium: Long = 0,
    val fourHard: Long = 0,
    val nineEasy: Long = 0,
    val nineMedium: Long = 0,
    val nineHard: Long = 0,
)
