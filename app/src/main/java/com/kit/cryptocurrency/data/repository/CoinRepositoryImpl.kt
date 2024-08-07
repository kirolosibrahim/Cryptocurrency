package com.kit.cryptocurrency.data.repository

import com.kit.cryptocurrency.common.Resource
import com.kit.cryptocurrency.data.datasource.remote.dto.CoinDetailsDTO
import com.kit.cryptocurrency.data.datasource.remote.services.CoinAPIService
import com.kit.cryptocurrency.domain.model.CoinListItemModel
import com.kit.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val apiService: CoinAPIService) :
    CoinRepository {


    override suspend fun getCoins(): Flow<Resource<List<CoinListItemModel>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = apiService.getCoins().map { it.toModel() }



            emit(Resource.Success(coins, isOnline = true))
        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    e.localizedMessage ?: "An unexpected error occured"
                )
            )
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

    override suspend fun getCoinById(coinId: String): Flow<Resource<CoinDetailsDTO>> = flow {
        try {
            emit(Resource.Loading())
            val coin = apiService.getCoinById(coinId = coinId)
            emit(Resource.Success(coin, isOnline = true))
        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    e.localizedMessage ?: "An unexpected error occured"
                )
            )
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}