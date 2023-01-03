package com.app.daggerhiltstudy.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}