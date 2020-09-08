package com.izzu.nontondotkom.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.izzu.nontondotkom.R
import com.izzu.nontondotkom.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_oneboarding_three.*

class OneboardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_three)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OneboardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
