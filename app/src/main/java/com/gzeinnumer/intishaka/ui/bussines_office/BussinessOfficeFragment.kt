package com.gzeinnumer.intishaka.ui.bussines_office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.gzeinnumer.intishaka.R
import kotlinx.android.synthetic.main.fragment_bussiness_office.view.*

class BussinessOfficeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_bussiness_office, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.menu_material.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_BussinessOfficeFragment_to_BussinessOfficeFormFragment)
        }
        view.menu_operational.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_BussinessOfficeFragment_to_OperationalFragment)
        }
    }

}
