package com.tooensure.travel.repos

import com.tooensure.travel.network.AccountApi

class FakeAccountRepository: AccountApi {
    override fun get(): String = "Welcome to your account API"
}