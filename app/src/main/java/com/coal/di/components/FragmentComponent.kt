package com.coal.di.components

import com.coal.di.modules.FragmentModule
import com.coal.ui.home.HomeFragment
import dagger.Component


@Component(modules = [FragmentModule::class], dependencies = [ApplicationComponent::class])
interface FragmentComponent {

    fun inject(fragement:HomeFragment)

}