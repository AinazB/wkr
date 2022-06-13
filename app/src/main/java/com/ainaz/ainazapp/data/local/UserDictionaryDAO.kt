package com.ainaz.ainazapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ainaz.ainazapp.data.model.translate.local.WordInfo
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDictionaryDAO {
    @Query("SELECT * FROM wordinfo")
    fun getAllWords(): Flow<List<WordInfo>>

    @Insert
    suspend fun insertWord(vararg word: WordInfo)

    @Delete
    suspend fun deleteWord(word: WordInfo)
}
