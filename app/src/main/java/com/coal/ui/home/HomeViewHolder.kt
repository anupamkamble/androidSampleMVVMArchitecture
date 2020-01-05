package com.coal.ui.home

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import com.coal.countryapp.R
import com.coal.di.components.BaseViewHolderComponent
import com.coal.ui.base.BaseItemViewHolder
import com.coal.ui.home.homePojo.HomeContent


class HomeViewHolder(parent: ViewGroup) : BaseItemViewHolder<HomeContent,HomeItemViewModel>(R.layout.item_view,parent){
    override fun injectDependencies(viewHolderComponent: BaseViewHolderComponent) {

    }

    override fun setupView(view: View) {
    }


}