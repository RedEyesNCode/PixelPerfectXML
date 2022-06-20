package com.redeyesncode.cleancodexml.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.cleancodexml.R
import com.redeyesncode.cleancodexml.databinding.ActivityUserNameBinding

class UserNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityUserNameBinding = ActivityUserNameBinding.inflate(layoutInflater)
        binding.btnNext.setOnClickListener {
            var intentNext = Intent(this@UserNameActivity,UserEmailActivity::class.java)
            startActivity(intentNext)

        }
        setContentView(binding.root)
    }
}