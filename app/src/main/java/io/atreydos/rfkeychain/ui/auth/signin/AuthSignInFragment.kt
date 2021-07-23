package io.atreydos.rfkeychain.ui.auth.signin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthSignInFragment : Fragment() {

    companion object {
        fun newInstance() = AuthSignInFragment()
    }

    private lateinit var viewModel: AuthSignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_sign_in, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthSignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}