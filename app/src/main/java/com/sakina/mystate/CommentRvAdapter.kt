package com.sakina.mystate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sakina.mystate.databinding.ActivityCommentsBinding
import com.sakina.mystate.databinding.CommentListItemBinding
import com.sakina.mystate.databinding.PostListItemsBinding

class CommentRvAdapter (var comment: List<Comment>):RecyclerView.Adapter<CommentsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder {
        var binding = CommentListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CommentsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentsViewHolder, position: Int) {
       var currentComments = comment.get(position)
        with(holder.binding){
            tvEmail.text=currentComments.email
            tvList.text=currentComments.name
            tvName.text=currentComments.postId.toString()
            tvbody.text=currentComments.body
            tvPostId.text=currentComments.id.toString()

        }
    }

    override fun getItemCount(): Int {
       return comment.size
    }


}

class CommentsViewHolder(var binding: CommentListItemBinding):RecyclerView.ViewHolder(binding.root){

}