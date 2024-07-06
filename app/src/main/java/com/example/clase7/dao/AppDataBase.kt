package com.example.clase7.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clase7.entities.Citys

@Database(entities = [Citys::class], version = 1)

abstract class AppDataBase:RoomDatabase() {

    abstract fun cityDao():Citydao
}