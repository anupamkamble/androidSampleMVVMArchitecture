package com.coal

import android.app.Application
import com.coal.di.components.ApplicationComponent
import com.coal.di.components.DaggerApplicationComponent
import com.coal.di.modules.ApplicationModule
import javax.inject.Inject


public class CountryApplicationClass: Application() {



    lateinit var  applicationComponent : ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent =  DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule())
            .build()

        applicationComponent.inject(CountryApplicationClass@this)

    }


}