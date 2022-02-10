package com.evirgenoguz.connecttotheinternet.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evirgenoguz.connecttotheinternet.network.CharacterModel
import com.evirgenoguz.connecttotheinternet.network.HarryPotterApi
import kotlinx.coroutines.launch
import java.lang.Exception


enum class HarryPotterApiStatus{
    LOADING, ERRROR, DONE
}


class OverviewModel: ViewModel() {
    private val _status = MutableLiveData<HarryPotterApiStatus>()
    val status: LiveData<HarryPotterApiStatus>
        get() = _status

    private val _characters = MutableLiveData<List<CharacterModel>>()
    val characters: LiveData<List<CharacterModel>>
        get() = _characters


    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            _status.value = HarryPotterApiStatus.LOADING

            try {
                _characters.value = HarryPotterApi.retrofitService.getCharacters().characters
                _status.value = HarryPotterApiStatus.DONE
            } catch (e: Exception) {
                _status.value = HarryPotterApiStatus.ERRROR
                _characters.value = ArrayList()
            }
        }
    }

}