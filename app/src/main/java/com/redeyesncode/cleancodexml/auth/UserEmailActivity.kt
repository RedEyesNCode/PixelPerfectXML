package com.redeyesncode.cleancodexml.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.cleancodexml.R
import com.redeyesncode.cleancodexml.databinding.ActivityUserEmailBinding

class UserEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityUserEmailBinding = ActivityUserEmailBinding.inflate(layoutInflater)
        binding.btnNext.setOnClickListener {
            var intentNext = Intent(this@UserEmailActivity,NotificationsActivity::class.java)
            startActivity(intentNext)

        }
        setContentView(binding.root)    }
}