package com.example.binaracademyapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FaqFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faq_fragment, container, false)
    }

    companion object {
        fun newInstance(): FaqFragment{
            val fragment = FaqFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}