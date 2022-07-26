package com.gener.graphsudoku.domain

import java.io.Serializable

data class SudokuNode(
    //location
    val x: Int,
    val y: Int,
    var color: Int = 0,
    //determine free cells
    var readOnly: Boolean = true
): Serializable /*for file system */ {
    override fun hashCode(): Int {
        return getHash(x,y)
    }
}

internal fun getHash(x: Int, y: Int):Int{
    //node reference
    val newX = x*100
    return "$newX$y".toInt()
}
