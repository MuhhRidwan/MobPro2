package org.d3if0023.mymodul1.data

import Mahasiswa
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MahasiswaDao {
    @Insert
    fun insertData(mahasiswa: Mahasiswa)

    @Query("SELECT * FROM mahasiswa ORDER BY nim")
    fun getData(): LiveData<List<Mahasiswa>>
}