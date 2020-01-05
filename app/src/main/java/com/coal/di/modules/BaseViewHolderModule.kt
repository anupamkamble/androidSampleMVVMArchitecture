package com.coal.di.modules

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleRegistry
import com.coal.di.ViewHolderScope
import com.coal.ui.base.BaseItemViewHolder
import com.coal.ui.base.BaseItemViewModel
import dagger.Module
import dagger.Provides


@Module
class BaseViewHolderModule(var viewHolder: BaseItemViewHolder<*, *>) {

    @ViewHolderScope
    @Provides
    fun providesLifecycleRegistry():Lifecycle = LifecycleRegistry(viewHolder)

}