package com.mycomposeapp.di

import android.app.Application
import android.content.Context
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    /*@Provides
    @Singleton
    fun provideMyDataStore(context: Context): DataStore {
        return DataStore(context)
    }*/

   /* @Provides
    @Singleton
    fun provideSocket(): Socket {
        return IO.socket(BuildConfig.SOCKET_BASE_URL)
    }*/

  /*  @Provides
    @Singleton
    fun provideShoppingateApi(dataStore: DataStore): ApiCallInterface {

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
        httpClient.callTimeout(60, TimeUnit.SECONDS)
        httpClient.connectTimeout(60, TimeUnit.SECONDS)
        httpClient.writeTimeout(60, TimeUnit.SECONDS)
        httpClient.readTimeout(60, TimeUnit.SECONDS)
        httpClient.addInterceptor(logging)

        httpClient.networkInterceptors().add(Interceptor { chain ->
            val requestBuilder: Request.Builder = chain.request().newBuilder()
            var lang = runBlocking { dataStore.getStringData(dataStore.appLanguage).first() }
            if (lang.isEmpty()) {
                lang = ApiObject.ApiHeaderValue.LANG_EN
            }
            requestBuilder.header(ApiObject.ApiHeaderKey.LANG, lang)

            val xApiKey = runBlocking {
                dataStore.getStringData(dataStore.apiKey).first()
            }

            if (xApiKey.isNotEmpty()) {
                requestBuilder.header(ApiObject.ApiHeaderKey.X_API_KEY, xApiKey)
            }

            *//*printLog(tag = "Header", value = "${ApiObject.ApiHeaderKey.X_API_KEY} - $xApiKey")
            printLog(
                tag = "Header",
                value = "${ApiObject.ApiHeaderKey.LANG} - ${lang}"
            )*//*

            chain.proceed(requestBuilder.build())
        })

        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(httpClient.build())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiCallInterface::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(context: Context, api: ApiCallInterface): ShoppingateRepository {
        return ShoppingateRepositoryImpl(context, api)
    }*/


}