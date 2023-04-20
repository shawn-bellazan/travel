package com.example.template.di

import com.example.template.network.AccountApi
import com.example.template.repos.AccountRepository
import com.example.template.repos.FakeAccountRepository
import com.example.template.repos.IAccountRepository
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