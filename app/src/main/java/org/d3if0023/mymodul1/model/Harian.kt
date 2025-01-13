package org.d3if0023.mymodul1.model

import com.squareup.moshi.Json
data class Harian(
    val key: Long,
    @Json(name = "jumlah_positif") val jumlahPositif: Value
)
