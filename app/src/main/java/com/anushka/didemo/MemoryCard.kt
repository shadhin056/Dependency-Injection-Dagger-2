package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class MemoryCard(memory:Int){
    var shadhin : Int
    init {
        shadhin = memory
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available $shadhin")
    }
}