package com.ainaz.ainazapp.di

import com.ainaz.ainazapp.data.remote.DictionaryApi
import com.ainaz.ainazapp.data.repository.WordInfoRepositoryImpl
import com.ainaz.ainazapp.domain.repository.WordInfoRepository
import com.ainaz.ainazapp.domain.usecase.GetWordInfo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WordInfoModule {

    @Provides
    @Singleton
    fun provideGetWordInfoUseCase(repository: WordInfoRepository): GetWordInfo {
        return GetWordInfo(repository)
    }

    @Provides
    @Singleton
    fun provideWordInfoRepository(
        api: DictionaryApi
    ): WordInfoRepository {
        return WordInfoRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideDictionaryApi(): DictionaryApi {
        return Retrofit.Builder()
            .baseUrl(DictionaryApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DictionaryApi::class.java)
    }
}
