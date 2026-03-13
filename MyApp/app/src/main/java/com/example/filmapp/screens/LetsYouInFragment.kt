package com.example.filmapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.filmapp.databinding.FragmentLetsYouInBinding



class LetsYouInFragment : Fragment() {
    private lateinit var binding: FragmentLetsYouInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLetsYouInBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSign.setOnClickListener {
            findNavController().navigate(LetsYouInFragmentDirections.actionLetsYouInFragmentToLoginFragment())
        }
    }


}