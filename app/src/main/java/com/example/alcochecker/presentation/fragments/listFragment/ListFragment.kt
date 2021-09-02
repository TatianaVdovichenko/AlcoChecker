package com.example.alcochecker.presentation.fragments.listFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import com.example.alcochecker.databinding.FragmentListBinding
import com.example.alcochecker.presentation.dialogs.DialogFragmentAdd

class ListFragment : Fragment() {

    companion object{
        val TAG:String = ListFragment.javaClass.name
    }

    private lateinit var binding: FragmentListBinding

    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)

        binding.flAdd.setOnClickListener {
            activity?.supportFragmentManager?.let {fragmentManager ->
                openAddDialog(fragmentManager)
            }
        }
        return binding.root
    }

    private fun openAddDialog(fragmentManager: FragmentManager){
        DialogFragmentAdd().show(fragmentManager,DialogFragmentAdd.TAG)
    }
}