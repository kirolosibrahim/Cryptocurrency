package com.kit.cryptocurrency.di

import com.kit.cryptocurrency.common.Constants
import com.kit.cryptocurrency.data.datasource.remote.services.CoinAPIService
import com.kit.cryptocurrency.data.repository.CoinRepositoryImpl
import com.kit.cryptocurrency.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {





    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinAPIService): CoinRepository {
        return CoinRepositoryImpl(api)
    }


}