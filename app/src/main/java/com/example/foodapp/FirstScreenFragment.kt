package com.example.foodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.foodapp.databinding.FragmentFirstScreenBinding


class FirstScreenFragment : Fragment() {

   private val binding by lazy {
       FragmentFirstScreenBinding.inflate(layoutInflater)
   }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return binding.root
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
        binding.getStartBtn.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_menu_screen3)
        }
    }
}