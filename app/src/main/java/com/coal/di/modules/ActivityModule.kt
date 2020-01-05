package com.coal.di.modules

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import com.coal.countryapp.BaseActivity
import com.coal.di.ActivityScope
import com.coal.ui.main.MainViewModel
import com.coal.utils.NetworkHelper
import com.coal.utils.ViewModelFactoryProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class ActivityModule(private val activity: BaseActivity<*>) {

    @ActivityScope
    @Provides
    fun provideContext(): Context = activity


    @Provides
    fun provideMainViewModel(composite: CompositeDisposable, networkHelper: NetworkHelper)
            :MainViewModel = ViewModelProviders.of(
        activity,ViewModelFactoryProvider(MainViewModel::class){ MainViewModel(composite, networkHelper) }).get(MainViewModel::class.java)
}
