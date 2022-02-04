package com.begumyolcu.urunlerroomapp.room

import androidx.room.*

@Dao
interface UrunlerDao {

    @Insert
    suspend fun urunEkle(urun: UrunModel)

    @Update
    suspend fun urunGuncelle(urun: UrunModel)

    @Delete
    suspend fun urunSil(urun: UrunModel)

    @Query("Select * from urunler_tablo")
    suspend fun tumUrunler(): List<UrunModel>

    @Query("Select * from urunler_tablo where id = :key")
    suspend fun urunGetir(key: Int): UrunModel?
}