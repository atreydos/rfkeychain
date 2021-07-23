package io.atreydos.rfkeychain.ui.auth.restore.step2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.atreydos.rfkeychain.R

class AuthRestoreAccessStep2Fragment : Fragment(R.layout.fragment_auth_restore_access_step2) {

    companion object {
        fun newInstance() = AuthRestoreAccessStep2Fragment()
    }

    private lateinit var viewModel: AuthRestoreAccessStep2ViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthRestoreAccessStep2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}