package com.androidexpert.mysimplecleanarchitecture.data

import com.androidexpert.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}