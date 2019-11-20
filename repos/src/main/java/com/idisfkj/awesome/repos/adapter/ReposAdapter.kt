package com.idisfkj.awesome.repos.adapter

import android.app.Application
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewAdapter
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewVH
import com.idisfkj.awesome.basic.recyclerview.CommonRecyclerViewVH
import com.idisfkj.awesome.common.model.BaseRecyclerViewModel
import com.idisfkj.awesome.common.model.ReposModel
import com.idisfkj.awesome.repos.BR
import com.idisfkj.awesome.repos.R
import com.idisfkj.awesome.repos.databinding.ReposItemReposLayoutBinding
import com.idisfkj.awesome.repos.vm.ReposeVHVM

/**
 * Created by idisfkj on 2019-11-20.
 * Email : idisfkj@gmail.com.
 */
class ReposAdapter(private val application: Application) : BaseRecyclerViewAdapter() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseRecyclerViewVH<ViewDataBinding, BaseRecyclerViewModel> {
        return CommonRecyclerViewVH<ReposItemReposLayoutBinding, ReposModel>(
            parent,
            R.layout.repos_item_repos_layout,
            ReposeVHVM(application),
            BR.vm
        )
    }
}