package com.anushka.didemo

import dagger.Module
import dagger.Provides

@Module
class NcBatteryModule {
    @Provides
    fun providesNcBattery(ncBattery:NcBattery):Battery{
       // return NcBattery()
        return ncBattery
    }

}