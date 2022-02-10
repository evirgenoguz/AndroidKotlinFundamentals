package com.evirgenoguz.connecttotheinternet.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.evirgenoguz.connecttotheinternet.databinding.FragmentOverviewBinding


class OverviewFragment : Fragment() {

    private lateinit var binding: FragmentOverviewBinding
    private val viewModel: OverviewModel by lazy { ViewModelProvider(this)[OverviewModel::class.java] }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOverviewBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.rvCharacter.adapter = CharactersAdapter()

    }

}