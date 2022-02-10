package com.evirgenoguz.connecttotheinternet.network

import com.squareup.moshi.Json

data class CharacterModel(
    val id: Int,
    val name: String,
    @Json(name = "image_url") val imageUrl: String,
    val house: String
) {
}