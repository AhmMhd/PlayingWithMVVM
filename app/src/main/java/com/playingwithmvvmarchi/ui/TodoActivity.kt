package com.playingwithmvvmarchi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.playingwithmvvmarchi.R
import com.playingwithmvvmarchi.data.Todo
import com.playingwithmvvmarchi.utils.InjectionUtils
import kotlinx.android.synthetic.main.activity_todo.*
import java.lang.StringBuilder

class TodoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initializeUI()
    }

    fun initializeUI()
    {
        val factory = InjectionUtils.provideTodoViewModelFactory()
        val viewmodel = ViewModelProviders.of(this,factory)
            .get(TodoViewModel::class.java)


        viewmodel.getTodos().observe(this, Observer {
            val stringbuilder = StringBuilder()
            it.forEach {
                stringbuilder.append("${it.todo} \n")
            }

            task.text = stringbuilder.toString()
        })

        add.setOnClickListener {
            viewmodel.addTodo(Todo(todo_et.text.toString(),false))
            todo_et.setText("")
        }
    }
}
