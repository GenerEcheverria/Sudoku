package com.gener.graphsudoku.domain

import java.lang.Exception

interface ISettingStorage {
    suspend fun getSettings(): SettingsStorageResult
    suspend fun updateSettings(settings: Settings): SettingsStorageResult
}

sealed class SettingsStorageResult {
    data class OnSuccess(val settings: Settings) : SettingsStorageResult()
    data class OnError(val error: Exception) : SettingsStorageResult()
}