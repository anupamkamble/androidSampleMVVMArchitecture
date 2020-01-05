package com.coal.ui.home

import com.coal.ui.base.BaseItemViewHolder
import com.coal.ui.base.BaseItemViewModel
import com.coal.ui.home.homePojo.HomeContent
import com.coal.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable


class HomeItemViewModel(var compo:CompositeDisposable, var net: NetworkHelper) : BaseItemViewModel<HomeContent>(compo, net){


    override fun onCreate() {

        //TODO

    }


}