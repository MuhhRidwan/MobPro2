package org.d3if0023.mymodul1.data

import androidx.lifecycle.LiveData

interface MahasiswaDao {

    fun insertData(mahasiswa: Mahasiswa)


    fun getData(): LiveData<List<Mahasiswa>>


    fun deleteData(ids: List<String>)
}