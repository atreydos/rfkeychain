package io.atreydos.rfkeychain.ui.auth.onboarding.step2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthOnboardingStep2Fragment : Fragment(R.layout.fragment_auth_onboarding_step2) {

    companion object {
        fun newInstance() = AuthOnboardingStep2Fragment()
    }

    private lateinit var viewModel: AuthOnboardingStep2ViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthOnboardingStep2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}