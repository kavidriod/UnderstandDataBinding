package com.ninja.understanddatabinding.data

import android.util.Log
import androidx.lifecycle.ViewModel

class StaticViewModel : ViewModel() {
    var name = "Dataa"
    var lastname = "Bindingg"
    var likes = 1
    val TAG = StaticViewModel::class.java.name

    fun onLike(){
        likes++
        Log.i(TAG, "onLike: "+likes)
    }
}