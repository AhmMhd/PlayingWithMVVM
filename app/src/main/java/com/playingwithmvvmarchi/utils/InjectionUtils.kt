package com.playingwithmvvmarchi.utils

import com.playingwithmvvmarchi.data.Database
import com.playingwithmvvmarchi.data.Repository
import com.playingwithmvvmarchi.data.TodoDAO
import com.playingwithmvvmarchi.ui.TodoViewModelProvider

object InjectionUtils
{
    fun provideTodoViewModelFactory() : TodoViewModelProvider
    {
        val repo = Repository.getInstance(Database.getInstance().todoDao)
        return TodoViewModelProvider(repo)
    }
}