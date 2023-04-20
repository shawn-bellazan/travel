package com.example.template.repos

import com.example.template.network.AccountApi

class FakeAccountRepository: AccountApi {
    override fun get(): String = "Welcome to your account API"
}