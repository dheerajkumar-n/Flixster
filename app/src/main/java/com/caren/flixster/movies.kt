package com.caren.flixster

class movies {

    @JvmField
    @SerializedName("movieName")
    var movieName: String? = null

    @SerializedName("movieDescription")
    var movieDescription: String? = null

    @SerializedName("movie_image")
    var movieImageUrl: String? = null

}

annotation class SerializedName(val value: String)
