package com.evirgenoguz.sorucevapbootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.evirgenoguz.sorucevapbootcamp.databinding.FragmentHomeBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonQuestion.setOnClickListener {
            //findNavController().navigate(R.id.action_homeFragment_to_questionFragment)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToQuestionFragment())
        }

        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionGlobalLogin())
        }




    }
}