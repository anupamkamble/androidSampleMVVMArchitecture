package com.coal.di.modules

import androidx.lifecycle.ViewModelProviders
import com.coal.di.ActivityScope
import com.coal.ui.base.BaseFragment
import com.coal.ui.home.HomeFragment
import com.coal.ui.home.HomeViewModel
import com.coal.ui.main.MainViewModel
import com.coal.utils.NetworkHelper
import com.coal.utils.ViewModelFactoryProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class FragmentModule(var fragment: BaseFragment<*>) {

    @ActivityScope
    @Provides
    fun provideFragmentContext() = fragment.context!!

    @Provides
    fun provideViewModel(composite: CompositeDisposable, networkHelper: NetworkHelper): HomeViewModel =
        ViewModelProviders.of(fragment, ViewModelFactoryProvider(HomeViewModel::class){
        HomeViewModel(composite,networkHelper)
    } ).get(HomeViewModel::class.java)
}