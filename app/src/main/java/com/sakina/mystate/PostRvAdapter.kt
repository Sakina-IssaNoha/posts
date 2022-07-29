package com.sakina.mystate

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sakina.mystate.databinding.PostListItemsBinding

class PostRvAdapter(var context: Context,var postList: List<Post>):
RecyclerView.Adapter<PostRvAdapter.PostsViewHolder>(){


        class PostsViewHolder(var binding: PostListItemsBinding):
                RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
                var binding = PostListItemsBinding.inflate(LayoutInflater.from(context),parent,false)
                return PostsViewHolder(binding)
        }

        override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
               var displayPost = postList.get(position)
                with(holder.binding){
                        tvUserid.text = displayPost.userId.toString()
                        tvId.text= displayPost.id.toString()
                        tvBody.text=displayPost.body
                        tvTitle.text=displayPost.title
                }
        }

        override fun getItemCount(): Int {
                return postList.size
        }
}

