package com.gzeinnumer.intishaka.ui.bussines_office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

import com.gzeinnumer.intishaka.R
import kotlinx.android.synthetic.main.fragment_meeting_form.view.*

class BussinessOfficeFormFragment : Fragment() {

    var objective = arrayOf("Promotion", "Price", "Operational", "Sidak")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bussiness_office_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view.sp_objective){
            adapter = ArrayAdapter(view.context, R.layout.support_simple_spinner_dropdown_item,objective)
            onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val data = parent?.getItemAtPosition(position).toString()
                    Toast.makeText(activity,data, Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}
