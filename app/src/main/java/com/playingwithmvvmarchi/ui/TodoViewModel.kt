package com.playingwithmvvmarchi.ui

import androidx.lifecycle.ViewModel
import com.playingwithmvvmarchi.data.Repository
import com.playingwithmvvmarchi.data.Todo

class TodoViewModel(private val repo : Repository) : ViewModel()
{
    fun getTodos() = repo.getTodos()
    fun addTodo(todo:Todo) = repo.addTodo(todo)
}