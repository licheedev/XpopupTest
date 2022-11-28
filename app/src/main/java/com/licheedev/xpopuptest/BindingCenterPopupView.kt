package com.licheedev.xpopuptest

import android.content.Context
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.lxj.xpopup.core.CenterPopupView


abstract class BindingCenterPopupView<T : ViewDataBinding>(context: Context) :
    CenterPopupView(context) {

    private var _binding: T? = null
    protected val binding get() = _binding!!

    override fun onCreate() {
        super.onCreate()
        _binding = DataBindingUtil.bind(popupImplView)
        binding.lifecycleOwner = this
    }

}