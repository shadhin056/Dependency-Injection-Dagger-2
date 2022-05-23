package com.anushka.didemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NcBatteryModule {
    @Binds
    abstract fun bindsNcBattery(ncBattery:NcBattery):Battery
}