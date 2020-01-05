package com.coal.di.components

import android.app.Application
import com.coal.CountryApplicationClass
import com.coal.di.modules.ApplicationModule
import com.coal.utils.NetworkHelper
import dagger.Component
import io.reactivex.disposables.CompositeDisposable


@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: CountryApplicationClass)



    fun getCompositeDisposable(): CompositeDisposable
    fun getNetworkHelper(): NetworkHelper

}