package com.izzu.nontondotkom.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bagicode.bwamov.checkout.model.Checkout
import com.bumptech.glide.Glide
import com.izzu.nontondotkom.R
import com.izzu.nontondotkom.home.model.Film
import com.izzu.nontondotkom.home.model.Today
import kotlinx.android.synthetic.main.activity_pilih_bangku.*
import kotlinx.android.synthetic.main.activity_tiket.*

class TiketActivity : AppCompatActivity() {

    private var dataList = ArrayList<Checkout>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiket)

        val data = intent.getParcelableExtra<Today>("data")

        tv_title.text = data.judul
        tv_genre.text = data.genre
        tv_rate.text = data.rating

        Glide.with(this)
            .load(data.poster)
            .into(iv_poster_image)

        rc_checkout.layoutManager = LinearLayoutManager(this)
        dataList.add(Checkout("C1",""))
        dataList.add(Checkout("C2",""))

        rc_checkout.adapter = TiketAdapter(dataList) {
        }
        iv_back.setOnClickListener {
            finish()
        }

    }
}
