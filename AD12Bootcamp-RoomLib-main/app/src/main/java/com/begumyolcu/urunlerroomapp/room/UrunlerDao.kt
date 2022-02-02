package com.begumyolcu.urunlerroomapp.room

import androidx.room.*

@Dao
interface UrunlerDao {

    @Insert
    fun urunEkle(urun: UrunModel)

    @Update
    fun urunGuncelle(urun: UrunModel)

    @Delete
    fun urunSil(urun: UrunModel)

    @Query("Select * from urunler_tablo")
    fun tumUrunler(): List<UrunModel>

    @Query("Select * from urunler_tablo where id = :key")
    fun urunGetir(key: Int): UrunModel?
}