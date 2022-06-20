package com.redeyesncode.cleancodexml.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.cleancodexml.R
import com.redeyesncode.cleancodexml.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityWelcomeBinding = ActivityWelcomeBinding.inflate(layoutInflater)
        binding.btnSignup.setOnClickListener {
            var intentNext = Intent(this@WelcomeActivity,UserNameActivity::class.java)
            startActivity(intentNext)

        }
        binding.btnLogin.setOnClickListener {
            var intentNext = Intent(this@WelcomeActivity,LoginActivity::class.java)
            startActivity(intentNext)
        }

        setContentView(binding.root)
    }
}