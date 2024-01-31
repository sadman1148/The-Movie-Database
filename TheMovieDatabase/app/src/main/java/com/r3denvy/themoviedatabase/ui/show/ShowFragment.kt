package com.r3denvy.themoviedatabase.ui.show

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.r3denvy.themoviedatabase.databinding.FragmentShowBinding

class ShowFragment : Fragment() {

    private lateinit var binding: FragmentShowBinding
    private lateinit var viewModel: ShowViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[ShowViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentShowBinding.inflate(layoutInflater)
        return binding.root
    }

}