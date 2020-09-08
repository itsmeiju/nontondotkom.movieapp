package com.izzu.nontondotkom.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.izzu.nontondotkom.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_my_wallet_top_up.*

class MyWalletTopUpActivity : AppCompatActivity() {

    private var status10K : Boolean = false
    private var status20K : Boolean = false
    private var status30K : Boolean = false
    private var status40K : Boolean = false
    private var status50K : Boolean = false
    private var status60K : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_wallet_top_up)

        btn_top_up.setOnClickListener {
            startActivity(Intent(this, MyWalletSuccessActivity::class.java))
        }

        tv_10k.setOnClickListener {
            if (status10K) {
                deselectMoney(tv_10k)
            } else {
                selectMoney(tv_10k)
            }
        }
        tv_20k.setOnClickListener {
            if (status20K) {
                deselectMoney(tv_20k)
            } else {
                selectMoney(tv_20k)
            }
        }
        tv_30k.setOnClickListener {
            if (status30K) {
                deselectMoney(tv_30k)
            } else {
                selectMoney(tv_30k)
            }
        }
        tv_40k.setOnClickListener {
            if (status40K) {
                deselectMoney(tv_40k)
            } else {
                selectMoney(tv_40k)
            }
        }
        tv_40k.setOnClickListener {
            if (status40K) {
                deselectMoney(tv_40k)
            } else {
                selectMoney(tv_40k)
            }
        }
        tv_50k.setOnClickListener {
            if (status50K) {
                deselectMoney(tv_50k)
            } else {
                selectMoney(tv_50k)
            }
        }
        tv_60k.setOnClickListener {
            if (status60K) {
                deselectMoney(tv_60k)
            } else {
                selectMoney(tv_60k)
            }
        }
        iv_backt.setOnClickListener {
            finish()
        }

    }

    private fun selectMoney(textView:TextView){
        textView.setTextColor(resources.getColor(R.color.darkblue))
        textView.setBackgroundResource(R.drawable.shape_line_pink)
        status10K = true
        status20K = true
        status30K = true
        status40K = true
        status50K = true
        status60K = true


        btn_top_up.visibility = View.VISIBLE
    }

    private fun deselectMoney(textView:TextView){
        textView.setTextColor(resources.getColor(R.color.darkgrey))
        textView.setBackgroundResource(R.drawable.shape_line_white)
        status10K = false
        status20K = false
        status30K = false
        status40K = false
        status50K = false
        status60K = false


        btn_top_up.visibility = View.INVISIBLE
    }
}
