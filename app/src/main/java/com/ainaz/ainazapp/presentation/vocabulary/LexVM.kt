package com.ainaz.ainazapp.presentation.vocabulary

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ainaz.ainazapp.data.repository.UserDictionaryRepositoryImpl
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LexVM @Inject constructor(val userDictionaryRepositoryImpl: UserDictionaryRepositoryImpl) :
    ViewModel() {
    fun insertWordIntoUserDictionary(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            userDictionaryRepositoryImpl.addNewWord(word)
        }
    }
}
