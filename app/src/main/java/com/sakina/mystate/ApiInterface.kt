package com.sakina.mystate

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPosts():retrofit2.Call<List<Post>>

    @GET("/posts/{postId}")
    fun getPostById(@Path("postId") postId: Int)
}