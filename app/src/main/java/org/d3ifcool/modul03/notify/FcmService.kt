package org.d3ifcool.modul03.notify

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FcmService : FirebaseMessagingService() {

    companion object {
        const val KEY_URL = "url"
    }

    override fun onNewToken(token: String) {
        Log.d("FCM", "Token baru: $token")
    }
}