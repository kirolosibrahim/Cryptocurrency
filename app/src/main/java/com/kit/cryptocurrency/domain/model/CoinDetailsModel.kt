package com.kit.cryptocurrency.domain.model

import com.kit.cryptocurrency.data.datasource.remote.dto.LinksDTO
import com.kit.cryptocurrency.data.datasource.remote.dto.LinksExtendedDTO
import com.kit.cryptocurrency.data.datasource.remote.dto.TagDTO
import com.kit.cryptocurrency.data.datasource.remote.dto.TeamDTO
import com.kit.cryptocurrency.data.datasource.remote.dto.WhitePaperDTO

data class CoinDetailsModel(
    val description: String,
    val development_status: String,
    val first_data_at: String,
    val hardware_wallet: Boolean,
    val hash_algorithm: String,
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val last_data_at: String,
    val links: LinksDTO,
    val links_extended: List<LinksExtendedDTO>,
    val logo: String,
    val message: String,
    val name: String,
    val open_source: Boolean,
    val org_structure: String,
    val proof_type: String,
    val rank: Int,
    val started_at: String,
    val symbol: String,
    val tags: List<TagDTO>,
    val team: List<TeamDTO>,
    val type: String,
    val whitepaper: WhitePaperDTO
)