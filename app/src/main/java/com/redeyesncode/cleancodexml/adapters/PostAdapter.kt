package com.redeyesncode.cleancodexml.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.redeyesncode.cleancodexml.databinding.PostListBinding

class PostAdapter(var strings:ArrayList<String>, var context: Context):RecyclerView.Adapter<PostAdapter.MyViewHolder> (){

    private lateinit var binding: PostListBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = PostListBinding.inflate(LayoutInflater.from(context))
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //TODO WILL DO LATER
    }

    override fun getItemCount(): Int {
        return strings.size
    }

    class MyViewHolder(binding:PostListBinding) :RecyclerView.ViewHolder(binding.root)

}