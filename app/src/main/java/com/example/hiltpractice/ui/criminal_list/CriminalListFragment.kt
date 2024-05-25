package com.example.hiltpractice.ui.criminal_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.hiltpractice.databinding.FragmentCriminalListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CriminalListFragment : Fragment() {
lateinit var binding:FragmentCriminalListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentCriminalListBinding.inflate(inflater, container, false)

        val criminalListViewModel = ViewModelProvider(this)[CriminalListViewModel::class.java]

//        criminalListViewModel.criminalList.observe(viewLifecycleOwner){
//            binding.rvCriminals.apply {
//                //layout manager
//                //adapter
//                layoutManager = LinearLayoutManager(context)
//                adapter = CriminalListAdapter(it.items)
//
//
//            }
//        }

        // Inflate the layout for this fragment
        return binding.root
    }


}