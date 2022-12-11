package com.androidexpert.mysimplecleanarchitecture.data

import com.androidexpert.mysimplecleanarchitecture.domain.IMessageRepository
import com.androidexpert.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}