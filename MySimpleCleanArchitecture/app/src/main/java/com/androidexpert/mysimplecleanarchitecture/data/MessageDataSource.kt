package com.androidexpert.mysimplecleanarchitecture.data

import com.androidexpert.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}