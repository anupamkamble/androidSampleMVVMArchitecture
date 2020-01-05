package com.coal.ui.main

import androidx.lifecycle.MutableLiveData
import com.coal.ui.base.BaseViewModel
import com.coal.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable


class MainViewModel(var composite: CompositeDisposable, networkHelper: NetworkHelper) : BaseViewModel(composite,networkHelper){



    val testData = MutableLiveData<String>()

    override fun onCreate() {
        testData.postValue("hello from main View modek")
    }
}