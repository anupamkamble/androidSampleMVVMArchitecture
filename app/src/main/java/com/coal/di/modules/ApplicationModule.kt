package com.coal.di.modules

import com.coal.data.remote.network.Repo
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class ApplicationModule {

    @Provides
    fun getRepo(): Repo{
        return Repo()
    }


    @Provides
    fun provideCompositeDesposiable() = CompositeDisposable()



}