package com.ainaz.ainazapp.presentation.learn

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ainaz.ainazapp.data.repository.UserDictionaryRepositoryImpl
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import com.ainaz.ainazapp.presentation.dictionary.DictionaryState
import com.ainaz.ainazapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnWordsVM @Inject constructor(val userDictionaryRepositoryImpl: UserDictionaryRepositoryImpl) :
    ViewModel() {

    private val _state = mutableStateOf(DictionaryState())
    val state: State<DictionaryState> = _state

    private val initWords = arrayListOf<Word>()

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
                        initWords.addAll(result.data ?: emptyList())
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

}
