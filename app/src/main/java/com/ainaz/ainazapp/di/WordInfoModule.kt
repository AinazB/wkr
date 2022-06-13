package com.ainaz.ainazapp.di

import android.content.Context
import androidx.room.Room
import com.ainaz.ainazapp.data.model.translate.local.WordDatabase
import com.ainaz.ainazapp.data.remote.DictionaryApi
import com.ainaz.ainazapp.data.remote.TranslatorApi
import com.ainaz.ainazapp.data.remote.TranslatorApi.Companion.BASE_URL
import com.ainaz.ainazapp.data.repository.TranslateRepositoryImpl
import com.ainaz.ainazapp.data.repository.UserDictionaryRepositoryImpl
import com.ainaz.ainazapp.data.repository.WordInfoRepositoryImpl
import com.ainaz.ainazapp.domain.repository.TranslateRepository
import com.ainaz.ainazapp.domain.repository.WordInfoRepository
import com.ainaz.ainazapp.domain.usecase.GetWordInfo
import com.ainaz.ainazapp.domain.usecase.Translate
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
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

    @Provides
    @Singleton
    fun provideTranslatorApi(): TranslatorApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TranslatorApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTranslateUseCase(repository: TranslateRepository): Translate {
        return Translate(repository)
    }

    @Provides
    @Singleton
    fun provideTranslateRepository(
        api: TranslatorApi
    ): TranslateRepository {
        return TranslateRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideDictionaryDatabase(@ApplicationContext context: Context): WordDatabase {
        return Room.databaseBuilder(context, WordDatabase::class.java, "word_database").build()
    }

    @Provides
    @Singleton
    fun provideUserDictionaryRepository(database: WordDatabase): UserDictionaryRepositoryImpl {
        return UserDictionaryRepositoryImpl(database.wordDao())
    }
}
