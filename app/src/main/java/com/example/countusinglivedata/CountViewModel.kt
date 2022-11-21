package com.example.countusinglivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var number = 100

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }


}



