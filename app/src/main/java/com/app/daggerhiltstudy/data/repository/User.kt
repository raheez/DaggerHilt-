package com.app.daggerhiltstudy.data.repository

import retrofit2.Retrofit
import javax.inject.Inject

data class User @Inject constructor(val name: String)
