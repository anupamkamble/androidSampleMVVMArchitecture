package com.coal.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coal.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.internal.disposables.ArrayCompositeDisposable
import io.reactivex.internal.disposables.DisposableHelper

abstract class BaseViewModel(
    var compositeDisposable: CompositeDisposable,
    var netWorkHelper: NetworkHelper) : ViewModel() {


    val messageStringId = MutableLiveData<Int>()
    val messageString = MutableLiveData<String>()



    protected  fun checkInterNetConnection(): Boolean = netWorkHelper.isNetworkConnected()


    protected  fun handleNetWorkError(err : Throwable){

    }

    abstract fun onCreate()


    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}