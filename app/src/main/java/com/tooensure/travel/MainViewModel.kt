package com.tooensure.travel

import androidx.lifecycle.ViewModel
import com.tooensure.travel.repos.AccountRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val _repository : AccountRepository
): ViewModel() {
    fun get(): String? = _repository.get()
}