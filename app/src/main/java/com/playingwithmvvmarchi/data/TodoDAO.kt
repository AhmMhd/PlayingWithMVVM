package com.playingwithmvvmarchi.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TodoDAO {
    private val todoList = mutableListOf<Todo>()
    private val todos = MutableLiveData<List<Todo>>()

    init {
        todos.value = todoList
    }

    fun addTodo(todo: Todo)
    {
        todoList.add(todo)
        todos.value = todoList
    }

    fun getTodos() = todos as LiveData<List<Todo>>
}