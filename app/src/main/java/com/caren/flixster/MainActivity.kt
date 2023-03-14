package com.caren.flixster

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import okhttp3.Headers
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = AsyncHttpClient()
        val params = RequestParams()

        client[
                "https://api.themoviedb.org/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed",
                params,
                object : JsonHttpResponseHandler() {
                    override fun onFailure(
                        statusCode: Int,
                        headers: Headers?,
                        response: String?,
                        throwable: Throwable?
                    ) {
                        Log.e("BestSellerBooksFragment", "It failed")
                    }

                    override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON?) {
                        val resultsJSON = json!!.jsonObject["results"].toString()
                        val gson = Gson()
                        val arrayBookType = object : TypeToken<List<movies>>() {}.type
                        val models: List<movies> =
                            gson.fromJson(resultsJSON, arrayBookType) as List<movies>
                        Log.e("GENIOUS", resultsJSON.toString())
                        var recyclerView = null
                        recyclerView.movieAdapter = movieAdapter(models, this@MainActivity)
                    }
                }
        ]
    }

    class Gson {
        fun fromJson(resultsJSON: String, arrayBookType: Type?): Any {
        return true
        }

    }
}
