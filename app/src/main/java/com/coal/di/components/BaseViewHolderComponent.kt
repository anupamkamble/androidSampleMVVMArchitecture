package com.coal.di.components

import com.coal.di.ViewHolderScope
import com.coal.di.modules.BaseViewHolderModule
import com.coal.ui.home.HomeItemViewModel
import dagger.Component



@ViewHolderScope
@Component(modules = [BaseViewHolderModule::class])
interface BaseViewHolderComponent {

    fun inject(viewModel: HomeItemViewModel)
}