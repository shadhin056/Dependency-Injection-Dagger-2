package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class NcBattery @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG","Power from NickelCadiumBattery")
    }
}