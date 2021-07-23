package io.atreydos.rfkeychain.ui.auth.onboarding.step1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthOnboardingStep1Fragment : Fragment(R.layout.fragment_auth_onboarding_step1) {

    companion object {
        fun newInstance() = AuthOnboardingStep1Fragment()
    }

    private lateinit var viewModel: AuthOnboardingStep1ViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthOnboardingStep1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}