package com.coal.ui.home

import com.coal.ui.base.BaseViewModel
import com.coal.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable


class HomeViewModel(var composite:CompositeDisposable, var network:NetworkHelper) : BaseViewModel(composite,network){



    override fun onCreate() {



    }


}