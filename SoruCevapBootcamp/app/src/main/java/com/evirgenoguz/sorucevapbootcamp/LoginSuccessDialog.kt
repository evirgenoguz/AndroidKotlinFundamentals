package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.evirgenoguz.sorucevapbootcamp.databinding.ConfirmationDialogBinding
import com.evirgenoguz.sorucevapbootcamp.databinding.DialogLoginSuccessBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class LoginSuccessDialog: BottomSheetDialogFragment() {

    private val binding by viewBinding(DialogLoginSuccessBinding::bind)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_login_success, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttoNextFromLoginDialog.setOnClickListener {
            findNavController().popBackStack(R.id.login, true)
        }


    }

}