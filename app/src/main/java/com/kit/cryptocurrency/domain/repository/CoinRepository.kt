package com.kit.cryptocurrency.domain.repository

import com.kit.cryptocurrency.common.Resource
import com.kit.cryptocurrency.data.datasource.remote.dto.CoinDetailsDTO
import com.kit.cryptocurrency.domain.model.CoinListItemModel
import kotlinx.coroutines.flow.Flow


interface CoinRepository {


    suspend fun getCoins(): Flow<Resource<List<CoinListItemModel>>>

    suspend fun getCoinById(coinId: String): Flow<Resource<CoinDetailsDTO>>

}