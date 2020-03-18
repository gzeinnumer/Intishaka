package com.gzeinnumer.intishaka.ui.bussines_office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.gzeinnumer.intishaka.R

class BussinessOfficeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_bussiness_office, container, false)

        return root
    }

}
