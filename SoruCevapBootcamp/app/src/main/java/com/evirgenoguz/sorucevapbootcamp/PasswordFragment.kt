package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentLoginBinding
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentPasswordBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class PasswordFragment : Fragment(R.layout.fragment_password) {

    private val binding by viewBinding(FragmentPasswordBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonNextToPasswordFragment.setOnClickListener {
            findNavController().navigate(PasswordFragmentDirections.actionPasswordFragmentToLoginSuccessDialog())
        }
    }
    

}