package id.ramadani.dendi

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("comments")
    fun getPosts(): Call<ArrayList<PostResponse>>
    //untuk mengambil data dari Json
}