package com.mycomposeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mycomposeapp.data.ScreenEnum
import com.mycomposeapp.domain.InitResponse
import com.mycomposeapp.presentation.screens.edit_profile.EditProfile
import com.mycomposeapp.presentation.screens.my_profile.MyProfile
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url


@Composable
fun MainNavGraph() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenEnum.EDIT_PROFILE.name) {
        composable(ScreenEnum.EDIT_PROFILE.name) {
            EditProfile(navController)
        }
        composable(ScreenEnum.MY_PROFILE.name) {
            MyProfile(navController)
        }
    }
}

class RetrofitClass {

    fun test(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dev.shoppinggate.app/api/v5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun apiRepo(): ApiService {
        return test().create(ApiService::class.java)
    }
}

interface ApiService {

    @GET
    fun init(@Url url: String): Call<InitResponse>

}
