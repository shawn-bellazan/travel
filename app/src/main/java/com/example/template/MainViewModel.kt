package com.example.template

import androidx.lifecycle.ViewModel
import com.example.template.repos.AccountRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val _repository : AccountRepository
): ViewModel() {
    fun get(): String? = _repository.get()
}