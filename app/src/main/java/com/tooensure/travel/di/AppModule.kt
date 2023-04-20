package com.tooensure.travel.di

import com.tooensure.travel.network.AccountApi
import com.tooensure.travel.repos.AccountRepository
import com.tooensure.travel.repos.FakeAccountRepository
import com.tooensure.travel.repos.IAccountRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAccountApi(): AccountApi = FakeAccountRepository()

    @Singleton
    @Provides
    fun provideCompanyName(
        api: AccountApi
    ): IAccountRepository = AccountRepository(api)


}