package com.playingwithmvvmarchi.data

//single sourse of truth
class Repository private constructor(private val todoDAO: TodoDAO)
{
    companion object
    {
        @Volatile private var instance : Repository? = null
        fun getInstance(todoDAO: TodoDAO) = instance ?: Repository(todoDAO).also { instance = it }
    }

    fun addTodo(todo : Todo)
    {
        todoDAO.addTodo(todo)
    }

    fun getTodos() = todoDAO.getTodos()
}
