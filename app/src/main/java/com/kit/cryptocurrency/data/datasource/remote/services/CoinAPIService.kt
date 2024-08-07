package com.kit.cryptocurrency.data.datasource.remote.services

import com.kit.cryptocurrency.data.datasource.remote.dto.CoinDetailsDTO
import com.kit.cryptocurrency.data.datasource.remote.dto.CoinListItemDTO
import retrofit2.http.GET
import retrofit2.http.Path


interface CoinAPIService  {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinListItemDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailsDTO

}