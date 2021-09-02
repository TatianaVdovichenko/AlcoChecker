package com.example.alcochecker.presentation.fragments.mainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.*
import com.example.alcochecker.R
import com.example.alcochecker.databinding.FragmentMainBinding
import com.example.alcochecker.presentation.dialogs.DialogFragmentList
import com.example.alcochecker.presentation.fragments.settingFragment.SettingFragment

class MainFragment: Fragment() {

    companion object {
        val TAG:String = MainFragment.javaClass.name
    }

    private lateinit var binding: FragmentMainBinding

    private val viewModel:MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.fmSettingBtn.setOnClickListener {
            activity?.supportFragmentManager?.let { fragmentManager ->
                openSettingFragment(fragmentManager)
            }
        }

        binding.fmAddBtn.setOnClickListener{
            activity?.supportFragmentManager?.let {fragmentManager->
                DialogFragmentList().show(fragmentManager, DialogFragmentList.TAG) }
        }

        return binding.root
    }

    private fun openSettingFragment(fragmentManager: FragmentManager){
        fragmentManager
            .beginTransaction()
            .replace(R.id.cfa_fragment_container, SettingFragment())
            .addToBackStack(TAG)
            .commit()
    }
}

