package com.ainaz.ainazapp.data.model.translate.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ainaz.ainazapp.data.local.UserDictionaryDAO

@Database(entities = [WordInfo::class], version = 1)
abstract class WordDatabase : RoomDatabase() {
    abstract fun wordDao(): UserDictionaryDAO
}
