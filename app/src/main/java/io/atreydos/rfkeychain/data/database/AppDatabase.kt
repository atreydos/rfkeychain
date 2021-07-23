package io.atreydos.rfkeychain.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.atreydos.rfkeychain.data.database.dao.RFKeysDao
import io.atreydos.rfkeychain.data.database.entity.RFKeyGroup
import io.atreydos.rfkeychain.data.database.entity.RFKey

@Database(entities = arrayOf(RFKey::class, RFKeyGroup::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "app_db"
    }


    init {
//        val db = Room.databaseBuilder(appContext, AppDatabase::class.java, DATABASE_NAME).build()
    }

    abstract fun rfKeysDao(): RFKeysDao
}