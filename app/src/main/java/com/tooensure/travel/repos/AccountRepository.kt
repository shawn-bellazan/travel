package com.tooensure.travel.repos

import com.tooensure.travel.network.AccountApi
import javax.inject.Inject

class AccountRepository @Inject constructor(
    private val _api: AccountApi): IAccountRepository {
    override fun get(): String? = _api.get()
}