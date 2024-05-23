package com.example.hiltpractice.ui.criminal_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hiltpractice.R


/**
 * A simple [Fragment] subclass.
 * Use the [CriminalDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CriminalDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_criminal_details, container, false)
    }

}