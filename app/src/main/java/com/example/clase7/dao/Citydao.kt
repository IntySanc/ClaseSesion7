package com.example.clase7.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.clase7.entities.Citys

@Dao

abstract class Citydao {
    @Insert
    abstract suspend fun insert (city: Citys)

    @Query ("select * from cities")
    abstract suspend fun getAllCities():List<Citys>

    @Update
    abstract suspend fun update(city: Citys)

    @Delete
    abstract suspend fun delete(city: Citys)

}