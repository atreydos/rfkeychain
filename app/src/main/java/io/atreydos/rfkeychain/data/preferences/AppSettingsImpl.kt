package io.atreydos.rfkeychain.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import io.atreydos.rfkeychain.domain.repository.AppSettings

class AppSettingsImpl(applicationContext: Context) : AppSettings {

    private val _preferences: SharedPreferences = EncryptedSharedPreferences(
        applicationContext,
        SP_FILENAME,
        MasterKey(applicationContext),
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    override var isOnboardingFinished: Boolean
        get() = _preferences.getBoolean(KEY_IS_ONBOARDING_FINISHED, false)
        set(value) = with(_preferences.edit()) {
            putBoolean(KEY_IS_ONBOARDING_FINISHED, value)
        }.apply()

    companion object {
        private const val SP_FILENAME = "sp_app_settings"
        private const val KEY_IS_ONBOARDING_FINISHED = "is_onboarding_finished"
    }

}