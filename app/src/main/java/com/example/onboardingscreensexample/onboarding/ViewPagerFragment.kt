package com.example.onboardingscreensexample.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboardingscreensexample.R
import com.example.onboardingscreensexample.databinding.FragmentViewPagerBinding
import com.example.onboardingscreensexample.onboarding.screens.FirstScreen
import com.example.onboardingscreensexample.onboarding.screens.SecondScreen
import com.example.onboardingscreensexample.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList, requireActivity().supportFragmentManager, lifecycle
        )

        binding.apply {
            viewPager.adapter = adapter
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding= null
    }
}