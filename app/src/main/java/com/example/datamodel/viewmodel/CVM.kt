package com.example.datamodel.viewmodel

import androidx.lifecycle.ViewModel

class CVM: ViewModel() {
    var c :Int=0
    fun incrementC(){
        c++
    }
    fun decrementC(){
         c--
    }
}