package com.kit.cryptocurrency.data.datasource.remote.dto

data class StatsDTO(
    val contributors: Int,
    val followers: Int,
    val stars: Int,
    val subscribers: Int
)