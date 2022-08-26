package com.sakina.mystate

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPosts():retrofit2.Call<List<Post>>

    @GET("/posts/{postId}")
    fun getPostById(@Path("postId") postId: Int): Call <Post>

    @GET("/comments")
    fun getComments(): Call<List<Comment>>
}