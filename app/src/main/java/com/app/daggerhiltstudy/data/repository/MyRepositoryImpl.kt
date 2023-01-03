package com.app.daggerhiltstudy.data.repository

import com.app.daggerhiltstudy.data.remote.MyApi
import com.app.daggerhiltstudy.domain.repository.MyRepository

class MyRepositoryImpl(
    private var api: MyApi
):MyRepository {
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}