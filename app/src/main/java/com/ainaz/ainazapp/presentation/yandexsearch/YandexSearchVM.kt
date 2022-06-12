package com.ainaz.ainazapp.presentation.yandexsearch

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ainaz.ainazapp.data.model.translate.TranslationDTO
import com.ainaz.ainazapp.domain.usecase.Translate
import com.ainaz.ainazapp.presentation.search.SearchViewModel
import com.ainaz.ainazapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class YandexSearchVM @Inject constructor(val translate: Translate) : ViewModel() {

    private val _searchQuery = mutableStateOf("")
    val searchQuery: State<String> = _searchQuery

    private val _state = mutableStateOf(SearchState())
    val state: State<SearchState> = _state

    private val _eventFlow = MutableSharedFlow<SearchViewModel.UIEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    private var searchJob: Job? = null

    fun onSearch(query: String) {
        _searchQuery.value = query
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(500L)
            translate(query)
                .onEach { result ->
                    when (result) {
                        is Resource.Success -> {
                            _state.value = state.value.copy(
                                result = result.data ?: TranslationDTO(emptyList()),
                                isLoading = false
                            )
                        }
                        is Resource.Error -> {
                            _state.value = state.value.copy(
                                result = result.data ?: TranslationDTO(emptyList()),
                                isLoading = false
                            )
                        }
                        is Resource.Loading -> {
                            _state.value = state.value.copy(
                                result = result.data ?: TranslationDTO(emptyList()),
                                isLoading = true
                            )
                        }
                    }
                }.launchIn(this)
        }
    }
}
