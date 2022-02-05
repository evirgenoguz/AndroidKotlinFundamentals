package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.evirgenoguz.sorucevapbootcamp.databinding.ConfirmationDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class ConfirmationDialog: BottomSheetDialogFragment() {

    private val binding by viewBinding(ConfirmationDialogBinding::bind)
    private val args:ConfirmationDialogArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.confirmation_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonYes.setOnClickListener {
            findNavController().navigate(ConfirmationDialogDirections.actionConfirmationDialogToResultFragment(
                args.answer
            ))
        }

        binding.buttonNo.setOnClickListener {
            findNavController().popBackStack()
        }


    }

}