package io.atreydos.rfkeychain.data.authenticator

import android.R.attr
import android.accounts.AbstractAccountAuthenticator
import android.accounts.Account
import android.accounts.AccountAuthenticatorResponse
import android.accounts.AccountManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import io.atreydos.rfkeychain.ui.auth.AuthActivity


class AccountAuthenticator(private val context: Context) : AbstractAccountAuthenticator(context) {

    companion object {
        const val ACCOUNT_TYPE_USER = "pixelwall.account.user"
        const val ACCOUNT_TYPE_DEVELOPER = "pixelwall.account.developer"
    }

    override fun editProperties(
        response: AccountAuthenticatorResponse?,
        accountType: String?
    ): Bundle {
        TODO("Not yet implemented")
    }

    override fun addAccount(
        response: AccountAuthenticatorResponse?,
        accountType: String?,
        authTokenType: String?,
        requiredFeatures: Array<out String>?,
        options: Bundle?
    ): Bundle {
        val intent = Intent(context, AuthActivity::class.java).apply {
            // This key can be anything. Try to use your domain/package
            putExtra("YOUR ACCOUNT TYPE", attr.accountType)
            // This key can be anything.
            // It's just a way of identifying the token's type (used when there are multiple permissions)
            putExtra("full_access", authTokenType)
            // This key can be anything.
            // Used for your reference. Can skip it too.
            putExtra("is_adding_new_account", true)
            // Copy this exactly from the line below.
            putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE, response)
        }
        return Bundle().apply { putParcelable(AccountManager.KEY_INTENT, intent) }
    }

    override fun confirmCredentials(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        options: Bundle?
    ): Bundle {
        TODO("Not yet implemented")
    }

    override fun getAuthToken(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        authTokenType: String?,
        options: Bundle?
    ): Bundle {
        val am = AccountManager.get(context)
        var authToken = am.peekAuthToken(account, authTokenType)

        if (TextUtils.isEmpty(authToken)) {
//            FIXME authToken = HTTPNetwork.login(account!!.name, am.getPassword(account))
        }


        if (!TextUtils.isEmpty(authToken)) {
            return Bundle().apply {
                putString(AccountManager.KEY_ACCOUNT_NAME, account!!.name)
                putString(AccountManager.KEY_ACCOUNT_TYPE, account!!.type)
                putString(AccountManager.KEY_AUTHTOKEN, authToken)
            }
        }

        // If you reach here, person needs to login again. or sign up

        // If we get here, then we couldn't access the user's password - so we
        // need to re-prompt them for their credentials. We do that by creating
        // an intent to display our AuthenticatorActivity which is the AccountsActivity in my case.
        val intent = Intent(context, AuthActivity::class.java).apply {
            putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE, response)
            putExtra("YOUR ACCOUNT TYPE", account!!.type)
            putExtra("full_access", authTokenType)
        }

        return Bundle().apply { putParcelable(AccountManager.KEY_INTENT, intent) }
    }

    override fun getAuthTokenLabel(authTokenType: String?): String {
        TODO("Not yet implemented")
    }

    override fun updateCredentials(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        authTokenType: String?,
        options: Bundle?
    ): Bundle {
        TODO("Not yet implemented")
    }

    override fun hasFeatures(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        features: Array<out String>?
    ): Bundle {
        TODO("Not yet implemented")
    }

    override fun getAccountRemovalAllowed(
        response: AccountAuthenticatorResponse?,
        account: Account?
    ): Bundle {
        return super.getAccountRemovalAllowed(response, account)
    }

    override fun getAccountCredentialsForCloning(
        response: AccountAuthenticatorResponse?,
        account: Account?
    ): Bundle {
        return super.getAccountCredentialsForCloning(response, account)
    }

    override fun addAccountFromCredentials(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        accountCredentials: Bundle?
    ): Bundle {
        return super.addAccountFromCredentials(response, account, accountCredentials)
    }

    override fun startAddAccountSession(
        response: AccountAuthenticatorResponse?,
        accountType: String?,
        authTokenType: String?,
        requiredFeatures: Array<out String>?,
        options: Bundle?
    ): Bundle {
        return super.startAddAccountSession(
            response,
            accountType,
            authTokenType,
            requiredFeatures,
            options
        )
    }

    override fun startUpdateCredentialsSession(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        authTokenType: String?,
        options: Bundle?
    ): Bundle {
        return super.startUpdateCredentialsSession(response, account, authTokenType, options)
    }

    override fun finishSession(
        response: AccountAuthenticatorResponse?,
        accountType: String?,
        sessionBundle: Bundle?
    ): Bundle {
        return super.finishSession(response, accountType, sessionBundle)
    }

    override fun isCredentialsUpdateSuggested(
        response: AccountAuthenticatorResponse?,
        account: Account?,
        statusToken: String?
    ): Bundle {
        return super.isCredentialsUpdateSuggested(response, account, statusToken)
    }
}