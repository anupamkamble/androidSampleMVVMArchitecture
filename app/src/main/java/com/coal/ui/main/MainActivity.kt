package com.coal.ui.main

import android.os.Bundle
import com.coal.countryapp.BaseActivity
import com.coal.countryapp.R
import com.coal.di.components.ActivityComponent


class MainActivity : BaseActivity<MainViewModel>(){


    override fun provideLayoutId() = R.layout.activity_main


    override fun injectDependencies(activityComponent: ActivityComponent)  = activityComponent.inject(this)

    override fun setUpView(savedInstanceState: Bundle?) {
        //TODO:: after setting up view
    }
}