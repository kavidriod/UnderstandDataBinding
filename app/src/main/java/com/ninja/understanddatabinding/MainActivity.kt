package com.ninja.understanddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ninja.understanddatabinding.data.ObservableViewModel
import com.ninja.understanddatabinding.data.StaticViewModel
import com.ninja.understanddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel  by lazy { ViewModelProvider(this).get(StaticViewModel::class.java) }
    private val viewModelObserve  by lazy { ViewModelProvider(this).get(ObservableViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.firstname = "Kooko"
        binding.lastname = "Monkey"

        //do DataBinding through ViewModel
        binding.viewmodel = viewModel

        binding.observableviewmodel = viewModelObserve
    }
}