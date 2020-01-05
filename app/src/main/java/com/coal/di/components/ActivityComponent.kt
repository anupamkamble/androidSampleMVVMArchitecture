package com.coal.di.components
import com.coal.countryapp.BaseActivity
import com.coal.di.ActivityScope
import com.coal.di.modules.ActivityModule
import com.coal.ui.main.MainActivity
import dagger.Component
import io.reactivex.disposables.CompositeDisposable


@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {

    fun inject(acivity : MainActivity)


    fun getCompositeDesposiblet(): CompositeDisposable
}
