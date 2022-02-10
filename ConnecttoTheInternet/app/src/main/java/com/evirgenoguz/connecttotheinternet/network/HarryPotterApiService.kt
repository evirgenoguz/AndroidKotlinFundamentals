package com.evirgenoguz.connecttotheinternet.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://canerture.com/api/harrypotterapp/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit =
    Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

interface HarryPotterApiService {
    @GET("all_data.php")
    suspend fun getCharacters(): CharacterResponse
}

object HarryPotterApi {
    val retrofitService: HarryPotterApiService by lazy {
        retrofit.create(HarryPotterApiService::class.java)
    }
}