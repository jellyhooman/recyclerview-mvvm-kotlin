package com.strivere.gamepedia.ui.mainmenu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.strivere.gamepedia.data.repositories.GamepediaRepository

class GamepediaViewModelFactory (private val repository: GamepediaRepository) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}