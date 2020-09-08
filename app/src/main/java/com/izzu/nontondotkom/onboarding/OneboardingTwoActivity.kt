package com.izzu.nontondotkom.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.izzu.nontondotkom.R
import kotlinx.android.synthetic.main.activity_oneboarding_two.*

class OneboardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_two)

        btn_home.setOnClickListener {
            val intent = Intent(this@OneboardingTwoActivity,
                OneboardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
