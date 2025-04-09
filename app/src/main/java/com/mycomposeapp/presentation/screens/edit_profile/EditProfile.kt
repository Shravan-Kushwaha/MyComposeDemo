package com.mycomposeapp.presentation.screens.edit_profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.mycomposeapp.data.ScreenEnum
import com.mycomposeapp.presentation.components.CommonEditText
import com.mycomposeapp.presentation.components.CommonHeader
import com.mycomposeapp.ui.theme.ThemeColor
import com.shopping_gate.customer.R

@Composable
fun EditProfile(navController: NavHostController, viewModel: EditProfileViewModel = viewModel()) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column {
            CommonHeader(
                title = stringResource(R.string.edit_profile),
                modifier = Modifier
                    .padding(innerPadding),
                navController = navController
            )

            TextFields()

            Spacer(modifier = Modifier.height(100.dp))

            Button(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                onClick = { navController.navigate(ScreenEnum.MY_PROFILE.name) },
                colors = ButtonColors(
                    containerColor = ThemeColor,
                    contentColor = Color.White,
                    disabledContentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent
                )
            ) {
                Text(
                    stringResource(R.string.save_changes),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }
        }
    }
}

@Composable
fun TextFields() {
    var firstName by rememberSaveable { mutableStateOf("") }
    var lastName by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var phone by rememberSaveable { mutableStateOf("") }
    var referralCode by rememberSaveable { mutableStateOf("") }

    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        CommonEditText(
            value = firstName,
            onValueChange = { firstName = it },
            label = "Enter first name",
            modifier = Modifier,
            leadingIcon = Icons.Default.Person
        )
        CommonEditText(
            value = lastName,
            onValueChange = { lastName = it },
            label = "Enter last name",
            modifier = Modifier,
            leadingIcon = Icons.Default.Person
        )
        CommonEditText(
            value = email,
            onValueChange = { email = it },
            label = "Enter email address",
            modifier = Modifier,
            leadingIcon = Icons.Default.Email,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            )
        )
        CommonEditText(
            value = phone,
            onValueChange = { phone = it },
            label = "Enter phone number",
            modifier = Modifier,
            leadingIcon = Icons.Default.Call,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Number
            )
        )
        CommonEditText(
            value = referralCode,
            onValueChange = { referralCode = it },
            label = "Enter referral code",
            modifier = Modifier,
            leadingIcon = Icons.Outlined.Menu,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text
            )
        )
    }
}