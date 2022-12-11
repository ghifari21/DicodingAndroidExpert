package com.androidexpert.mysimplecleanarchitecture.di

import com.androidexpert.mysimplecleanarchitecture.data.IMessageDataSource
import com.androidexpert.mysimplecleanarchitecture.data.MessageDataSource
import com.androidexpert.mysimplecleanarchitecture.data.MessageRepository
import com.androidexpert.mysimplecleanarchitecture.domain.IMessageRepository
import com.androidexpert.mysimplecleanarchitecture.domain.MessageInteractor
import com.androidexpert.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}