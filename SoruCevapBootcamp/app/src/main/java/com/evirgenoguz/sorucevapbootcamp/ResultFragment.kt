package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentQuestionBinding
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentResultBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class ResultFragment : Fragment(R.layout.fragment_result) {
    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args:ResultFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // val answer = arguments?.getString("answer")

        binding.result.text = when {
            args.answer.equals("ankara", ignoreCase = true) -> "Tebrikler Bildiniz!"
            else -> "Üzgünüz Bilemediniz!"
        }
    }
}