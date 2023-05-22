package com.tp31.astarioclient.retrofit

import com.tp31.astarioclient.model.Post
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostApi {

    @GET("/employee/get-all")
    fun getAllEmployees(): Call<List<Post?>?>?

    @POST("/employee/save")
    fun save(@Body employee: Post?): Call<Post?>?
}