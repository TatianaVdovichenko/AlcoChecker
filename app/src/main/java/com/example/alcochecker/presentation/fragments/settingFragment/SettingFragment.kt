package com.example.alcochecker.presentation.fragments.settingFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.*
import com.example.alcochecker.R
import com.example.alcochecker.databinding.FragmentSettingBinding
import com.example.alcochecker.presentation.fragments.listFragment.ListFragment

class SettingFragment : Fragment() {

    companion object {
        val TAG:String = SettingFragment.javaClass.name
    }

    private lateinit var binding: FragmentSettingBinding
    private val viewModel: SettingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingBinding.inflate(inflater, container, false)
        binding.fsToList.setOnClickListener {
            activity?.supportFragmentManager?.let { fragmentManager ->
                openListFragment(fragmentManager)
            }
        }
        return binding.root
    }

    private fun openListFragment(fragmentManager: FragmentManager){
        fragmentManager
            .beginTransaction()
            .replace(R.id.cfa_fragment_container, ListFragment())
            .commit()
    }
}
