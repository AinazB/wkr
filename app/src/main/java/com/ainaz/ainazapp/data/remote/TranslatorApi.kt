package com.ainaz.ainazapp.data.remote

import com.ainaz.ainazapp.data.model.translate.TranslationDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface TranslatorApi {

    @GET("/api/v1/dicservice.json/lookup")
    suspend fun translate(
        @Query("key") apiKey: String = "dict.1.1.20220611T090654Z.ceebfce2a79f7119.d23963aae60d5f1e3fca5e923abb90a032c67d65",
        @Query("lang") lang: String = "en-ru",
        @Query("text") text: String
    ): TranslationDTO

    companion object {
        const val BASE_URL = "https://dictionary.yandex.net"
    }
}
