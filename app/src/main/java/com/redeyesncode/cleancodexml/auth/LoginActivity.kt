package com.redeyesncode.cleancodexml.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.cleancodexml.DashboardActivity
import com.redeyesncode.cleancodexml.R
import com.redeyesncode.cleancodexml.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding:ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        binding.btnNext.setOnClickListener {
            var intentNext = Intent(this@LoginActivity,DashboardActivity::class.java)
            startActivity(intentNext)
        }

        setContentView(binding.root)
    }
}