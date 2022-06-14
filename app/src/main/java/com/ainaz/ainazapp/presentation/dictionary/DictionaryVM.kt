package com.ainaz.ainazapp.presentation.dictionary

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ainaz.ainazapp.data.local.UserDictionaryDAO
import com.ainaz.ainazapp.data.model.translate.remote.TranslationDTO
import com.ainaz.ainazapp.data.repository.UserDictionaryRepositoryImpl
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import com.ainaz.ainazapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DictionaryVM @Inject constructor(val userDictionaryRepositoryImpl: UserDictionaryRepositoryImpl) :
    ViewModel() {

    private val _state = mutableStateOf(DictionaryState())
    val state: State<DictionaryState> = _state

    init {
        getAllWords()
    }

    fun getAllWords() {
        viewModelScope.launch {
            userDictionaryRepositoryImpl.getUserWords().onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        _state.value = state.value.copy(
                            result = result.data ?: emptyList(),
                            isLoading = false
                        )
                    }
                    is Resource.Loading -> {
                        _state.value = state.value.copy(
                            result = result.data ?: emptyList(),
                            isLoading = true
                        )
                    }
                    is Resource.Error -> {

                    }
                }
            }.launchIn(this)
        }
    }

    fun addNewWord(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            userDictionaryRepositoryImpl.addNewWord(word)
        }
    }
}
