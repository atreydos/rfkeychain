package io.atreydos.rfkeychain.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import io.atreydos.rfkeychain.data.authenticator.AccountAuthenticator


class AuthenticatorService : Service() {

    // Instance field that stores the authenticator object
    // Notice, this is the same Authenticator class we defined earlier
    lateinit var mAuthenticator: AccountAuthenticator

    override fun onCreate() {
        // Create a new authenticator object
        mAuthenticator = AccountAuthenticator(this)
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    override fun onBind(intent: Intent?): IBinder? {
        return mAuthenticator.iBinder
    }
}