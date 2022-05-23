package com.anushka.didemo

import dagger.Component

@Component(modules = [MemoryCardModule::class,NcBatteryModule::class])
interface SmartPhoneComponent {
    fun inject (mainActivity:MainActivity)
}