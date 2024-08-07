package com.kit.cryptocurrency.di

import com.kit.cryptocurrency.common.Constants
import com.kit.cryptocurrency.data.datasource.remote.services.CoinAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideAPIService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Provides
    @Singleton
    fun provideCoinAPIService(retrofit: Retrofit): CoinAPIService {
        return retrofit.create(CoinAPIService::class.java)
    }


}