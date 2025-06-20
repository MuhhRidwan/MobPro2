package org.d3if0023.mymodul1.data

import com.google.firebase.database.Exclude

data class Mahasiswa(
    @get:Exclude
    var id: String = "",
    var nim: String = "",
    var nama: String = ""
)