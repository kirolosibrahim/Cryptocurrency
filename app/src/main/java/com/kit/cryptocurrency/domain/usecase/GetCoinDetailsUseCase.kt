package com.kit.cryptocurrency.domain.usecase

import com.kit.cryptocurrency.common.Resource
import com.kit.cryptocurrency.data.datasource.remote.dto.CoinListItemDTO
import com.kit.cryptocurrency.domain.model.CoinListItemModel
import com.kit.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinDetailsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    suspend operator fun invoke(): Flow<Resource<List<CoinListItemModel>>> {
        return repository.getCoins()
    }
}