package com.izzu.nontondotkom.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.izzu.nontondotkom.R
import com.izzu.nontondotkom.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_oneboarding_one.*
import kotlinx.android.synthetic.main.activity_oneboarding_three.btn_home

class OneboardingOneActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_one)

        btn_home.setOnClickListener {
            val intent = Intent(this@OneboardingOneActivity,
                OneboardingTwoActivity::class.java)
            startActivity(intent)
        }
        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OneboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}