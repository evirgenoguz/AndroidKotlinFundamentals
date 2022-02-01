package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentHomeBinding
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class QuestionFragment : Fragment(R.layout.fragment_question) {
    private val binding by viewBinding(FragmentQuestionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener {


            var answer = binding.editTextAnswer.text.toString()
            /*
            findNavController().navigate(R.id.action_questionFragment_to_resultFragment, bundleOf("answer" to answer))
            */
            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultFragment(
                answer
            ))
        }

    }
}