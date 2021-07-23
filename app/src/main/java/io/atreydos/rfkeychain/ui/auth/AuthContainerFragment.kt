package io.atreydos.rfkeychain.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthContainerFragment : Fragment(R.layout.fragment_auth_container) {

    companion object {
        fun newInstance() = AuthContainerFragment()
    }

    private lateinit var viewModel: AuthContainerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_container, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthContainerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}