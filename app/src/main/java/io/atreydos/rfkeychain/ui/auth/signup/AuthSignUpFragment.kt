package io.atreydos.rfkeychain.ui.auth.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthSignUpFragment : Fragment(R.layout.fragment_auth_sign_up) {

    companion object {
        fun newInstance() = AuthSignUpFragment()
    }

    private lateinit var viewModel: AuthSignUpViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthSignUpViewModel::class.java)
        // TODO: Use the ViewModel
    }

}