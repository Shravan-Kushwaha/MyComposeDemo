package com.mycomposeapp.presentation.screens.my_profile

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mycomposeapp.data.ScreenEnum
import com.mycomposeapp.domain.InitResponse
import com.mycomposeapp.navigation.RetrofitClass
import com.mycomposeapp.presentation.components.CommonButton
import com.mycomposeapp.presentation.components.CommonText
import com.mycomposeapp.ui.theme.SubThemeColor
import com.mycomposeapp.ui.theme.ThemeColor
import com.mycomposeapp.ui.theme.ThemeColor2
import com.shopping_gate.customer.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


@Composable
fun MyProfile(
    navController: NavHostController = rememberNavController(),
    viewModel: MyProfileViewModel = viewModel(),
    modifier: Modifier = Modifier.padding(
        horizontal = 16.dp, vertical = 16.dp
    )
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Header(modifier)
            ProfileInfo(navController = navController)
            Spacer(Modifier.height(10.dp))
            DrawerScreenList(navController = navController)
            Spacer(Modifier.height(10.dp))
            CommonButton(navController, text = "Delete Account")
        }
    }
}

data class DrawerListModel(val icon: ImageVector, val name: String)

@Composable
fun DrawerScreenList(navController: NavHostController) {
    val drawerList = listOf(
        DrawerListModel(Icons.Outlined.Person, "My Accounts"),
        DrawerListModel(Icons.Outlined.List, "Orders"),
        DrawerListModel(Icons.Outlined.DateRange, "My Wallet"),
        DrawerListModel(Icons.Outlined.DateRange, "My Rewards"),
        DrawerListModel(Icons.Outlined.DateRange, "Change Language"),
        DrawerListModel(Icons.Outlined.DateRange, "Invite & Earn")
    )
    LazyColumn {
        items(drawerList.size) { index ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clip(CircleShape)
                    .background(SubThemeColor)
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Leading Icon
                Icon(
                    imageVector = drawerList[index].icon,
                    contentDescription = drawerList[index].name,
                    tint = ThemeColor
                )

                Spacer(Modifier.width(10.dp))

                // Text with weight to push the next icon to the right
                CommonText(
                    text = drawerList[index].name,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            val call: Call<InitResponse> = RetrofitClass().apiRepo()
                                .init("customer/Auth/init_new/1.1.7/android/")
                            call.enqueue(object : Callback<InitResponse> {
                                override fun onResponse(
                                    call: Call<InitResponse>,
                                    response: Response<InitResponse>
                                ) {
                                    Log.e("TAG", "onResponse:${response.body()}")
                                }

                                override fun onFailure(call: Call<InitResponse>, t: Throwable) {
                                    Log.e("TAG", "onFailure:${t.message} ")
                                }
                            })
                        } // Takes up all available space
                )

                // Trailing Icon (Aligned at End)
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowRight,
                    contentDescription = "Arrow",
                    tint = ThemeColor
                )
            }
        }
    }
}

@Composable
fun ProfileInfo(
    navController: NavHostController,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .background(ThemeColor2, RoundedCornerShape(10.dp))
        .border(1.dp, ThemeColor, RoundedCornerShape(10.dp))

) {
    Column(modifier = modifier.padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            CommonText("Shravan k")
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Star Icon",
                Modifier.clickable {
                    navController.navigate(ScreenEnum.EDIT_PROFILE.name)
                })
        }
        Spacer(Modifier.height(10.dp))
        Row {
            Icon(imageVector = Icons.Default.Phone, contentDescription = "Star Icon")
            Text("123456789", modifier = Modifier.padding(start = 8.dp))
        }
        Spacer(Modifier.height(5.dp))
        Row {
            Icon(imageVector = Icons.Default.Email, contentDescription = "Star Icon")
            Text("test@yopmail.com", modifier = Modifier.padding(start = 8.dp))
        }
    }
}


@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = modifier.fillMaxWidth()) {
        Text(
            stringResource(R.string.my_profile),
            fontSize = 18.sp,
            style = TextStyle(fontWeight = FontWeight.SemiBold)
        )
        Text(
            stringResource(R.string.logout),
            fontSize = 18.sp,
            color = ThemeColor,
            style = TextStyle(fontWeight = FontWeight.SemiBold)
        )
    }
}

@Preview
@Composable
private fun MyProfilePreview() {
    MyProfile()
}
