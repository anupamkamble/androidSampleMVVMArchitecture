package com.coal.ui.home

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.coal.ui.base.BaseAdapter
import com.coal.ui.home.homePojo.HomeContent


class HomeAdapter(parentLifecycle: Lifecycle
                  ,data:ArrayList<HomeContent>) : BaseAdapter<HomeContent,HomeViewHolder>(parentLifecycle,data){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HomeViewHolder(parent)

}