package com.licheedev.xpopuptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lxj.xpopup.XPopup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btnShowPopup).setOnClickListener {

            val popup = SimpleTipsPopup(this, "测试弹框")

            XPopup.Builder(this)
                .isDestroyOnDismiss(true)
                .asCustom(popup)
                .show()

        }

    }


}