package com.licheedev.xpopuptest

import android.content.Context
import com.licheedev.xpopuptest.databinding.DialogSimpleTipsBinding

/** 简单提示弹框 */
class SimpleTipsPopup(context: Context, val message: String) :
    BindingCenterPopupView<DialogSimpleTipsBinding>(context) {


    override fun getImplLayoutId(): Int = R.layout.dialog_simple_tips

    override fun onCreate() {
        super.onCreate()

        binding.btnClose.setOnClickListener { dismiss() }
        binding.tvMessage.text = message
    }


}