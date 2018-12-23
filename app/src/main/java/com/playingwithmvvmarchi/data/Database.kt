package com.playingwithmvvmarchi.data

class Database private constructor()
{
    val todoDao = TodoDAO()

    companion object
    {
        @Volatile private var instance : Database? = null
        fun getInstance() = instance ?: Database().also { instance = it }
    }
}