package com.mycomposeapp.data

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)

        Log.e("TAG", "onNewToken: $token")

    }
}