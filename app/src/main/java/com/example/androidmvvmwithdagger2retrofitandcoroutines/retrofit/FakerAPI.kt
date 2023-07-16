package com.example.androidmvvmwithdagger2retrofitandcoroutines.retrofit

import com.example.androidmvvmwithdagger2retrofitandcoroutines.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts(): Response<List<Product>>

}