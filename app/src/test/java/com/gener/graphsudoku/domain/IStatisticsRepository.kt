package com.gener.graphsudoku.domain

import java.lang.Exception

interface IStatisticsRepository {
    suspend fun getStatistics(
        onSuccess: (UserStatistics)->Unit,
        onError: (Exception) ->Unit
    )
    suspend fun updateStatistics(
        time:Long,
        diff:Difficulty,
        boundary:Int,
        onSuccess: (isRecord:Boolean) -> Unit,
        onError: (Exception) -> Unit
    )
}