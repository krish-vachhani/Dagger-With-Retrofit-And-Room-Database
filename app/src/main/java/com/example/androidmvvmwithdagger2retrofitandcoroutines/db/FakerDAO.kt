package com.example.androidmvvmwithdagger2retrofitandcoroutines.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidmvvmwithdagger2retrofitandcoroutines.models.Product

@Dao
interface FakerDAO {

    @Insert
    suspend fun addProducts(products: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts(): List<Product>
}