package com.example.clase7.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "cities")

class Citys (
    @PrimaryKey(autoGenerate = true) val id:Int,
    val name:String,
    val description:String,
    val pepulation:Int

)