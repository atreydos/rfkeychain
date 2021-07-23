package io.atreydos.rfkeychain.ui.auth.restore.step1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import io.atreydos.rfkeychain.R

class AuthRestoreAccessStep1Fragment : Fragment(R.layout.fragment_auth_restore_access_step1) {

    companion object {
        fun newInstance() = AuthRestoreAccessStep1Fragment()
    }

    private lateinit var viewModel: AuthRestoreAccessViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthRestoreAccessViewModel::class.java)
        // TODO: Use the ViewModel
    }

}