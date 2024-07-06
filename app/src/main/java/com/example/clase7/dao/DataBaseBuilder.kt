package com.example.clase7.dao

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

object DataBaseBuilder {
    @Volatile
    private var INSTANCE: AppDataBase? = null

    fun getInstance (context:Context):AppDataBase {

        return INSTANCE ?: synchronized(this) {

            val instance= Room.databaseBuilder(

                context.applicationContext,

                AppDataBase::class.java,
                name = "app_database"
            )  .build()
            INSTANCE = instance
            instance
        }
    }

}