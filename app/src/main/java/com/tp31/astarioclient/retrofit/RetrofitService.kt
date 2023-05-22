package com.tp31.astarioclient.retrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService() {

    private var retrofit: Retrofit? = null

    init {
        initializeRetrofit()
    }

    private fun initializeRetrofit() {
        retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.1.5:9000")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
    }

    fun getRetrofit(): Retrofit? {
        return retrofit
    }
}