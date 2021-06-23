package com.example.onboardingscreensexample.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreensexample.R
import com.example.onboardingscreensexample.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {

    private var _binding: FragmentSecondScreenBinding?=  null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondScreenBinding.inflate(inflater, container, false)

        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.apply {
            btnNextFirst.setOnClickListener {
                viewPager?.currentItem = 2
            }
        }
        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}