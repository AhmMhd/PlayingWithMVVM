package com.playingwithmvvmarchi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.playingwithmvvmarchi.data.Repository

class TodoViewModelProvider(private val repo : Repository) : ViewModelProvider.NewInstanceFactory()
{
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TodoViewModel(repo) as T
    }
}