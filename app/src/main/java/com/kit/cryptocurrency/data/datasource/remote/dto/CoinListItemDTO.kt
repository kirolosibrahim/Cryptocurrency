package com.kit.cryptocurrency.data.datasource.remote.dto

import com.kit.cryptocurrency.domain.model.CoinListItemModel

data class CoinListItemDTO(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
) {
    fun toModel(): CoinListItemModel {
        return CoinListItemModel(
            id = id,
            isActive = is_active,
            isNew = is_new,
            name = name,
            rank = rank,
            type = type,
            symbol = symbol,
        )
    }
}