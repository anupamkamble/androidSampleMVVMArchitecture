package com.coal.ui.home

import android.view.View
import com.coal.di.components.FragmentComponent
import com.coal.ui.base.BaseFragment
import com.coal.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable

class HomeFragment(compo:CompositeDisposable, var networkHelper: NetworkHelper) : BaseFragment<HomeViewModel>(compo,networkHelper){

    override fun provideLayoutId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

//    override fun injectDependencies(fragmentComponent: FragmentComponent) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun setupView(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}