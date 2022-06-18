package com.redeyesncode.cleancodexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.redeyesncode.cleancodexml.adapters.PostAdapter
import com.redeyesncode.cleancodexml.databinding.ActivityUserProfileBinding
import com.redeyesncode.cleancodexml.databinding.PostListBinding

class UserProfileActivity : AppCompatActivity() {
    private  var string :ArrayList<String> = ArrayList()
    private lateinit var binding: ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        string.add("")
        binding.recvPosts.adapter = PostAdapter(string,this@UserProfileActivity)
        binding.recvPosts.layoutManager = GridLayoutManager(this@UserProfileActivity,3)
    }
}