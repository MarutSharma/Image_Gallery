package com.example.image_gallery

data class Image(
    val title: String,
    val image: Int = 0,
    var status: Boolean = false,
    val descp: String = ""
)
