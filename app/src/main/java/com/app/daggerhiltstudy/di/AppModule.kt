package com.app.daggerhiltstudy.di

import com.app.daggerhiltstudy.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    fun provideMyApi():MyApi{
        return Retrofit.Builder().baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }


    @Provides
    @Singleton
    fun provideName(): String {
        return "Raheez"
    }

}