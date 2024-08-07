package com.kit.cryptocurrency.data.datasource.remote.dto

data class LinksDTO(
    val explorer: List<String>,
    val facebook: List<String>,
    val reddit: List<String>,
    val source_code: List<String>,
    val website: List<String>,
    val youtube: List<String>
)