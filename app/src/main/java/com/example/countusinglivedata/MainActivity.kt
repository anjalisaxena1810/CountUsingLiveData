package com.example.countusinglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.countusinglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var factory: CountFactory
    private lateinit var viewModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        factory = CountFactory(100)
        viewModel = ViewModelProvider(this).get(CountViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            dataBinding.Display.text = it.toString()
        })

        incrementText()

    }
    private  fun incrementText(){
        dataBinding.count.setOnClickListener {
            viewModel.currentNumber.value = ++viewModel.number
        }
    }



    }



