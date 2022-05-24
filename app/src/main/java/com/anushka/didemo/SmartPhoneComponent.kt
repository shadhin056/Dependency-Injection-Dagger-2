package com.anushka.didemo

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class,NcBatteryModule::class])
interface SmartPhoneComponent {
    fun inject (mainActivity:MainActivity)
}