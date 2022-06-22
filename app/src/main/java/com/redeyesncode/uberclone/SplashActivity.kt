package com.redeyesncode.uberclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed(Runnable { var intent = Intent(this@SplashActivity,LoginActivity::class.java)
                                       startActivity(intent)},2000)
        setContentView(R.layout.activity_splash)
    }
}