package com.ninja.understanddatabinding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ObservableViewModel : ViewModel() {
    private val _likes =  MutableLiveData(0)
    private val _name = MutableLiveData("Data Binding")

    val likes: LiveData<Int> = _likes
    val name: LiveData<String> = _name

    fun onLike(){
        _likes.value = (_likes.value ?: 0) + 1
    }
}