package com.gzeinnumer.intishaka.ui.bussines_office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager

import com.gzeinnumer.intishaka.R
import com.gzeinnumer.intishaka.model.MyData
import kotlinx.android.synthetic.main.fragment_operational.view.*

class OperationalFragment : Fragment(), MyCallBack {
    var data = ArrayList<MyData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        data.clear()
        return inflater.inflate(R.layout.fragment_operational, container, false)
    }

    lateinit var bundle: Bundle

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState != null) {
            bundle = savedInstanceState
        }
        data.add(MyData("Transportation", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Hotel", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Daily Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Meal Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Gasoline Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        view.rv.apply{
            adapter = CostumAdapter(view.context,data, this@OperationalFragment)
            layoutManager = LinearLayoutManager(view.context)
            hasFixedSize()
        }
    }


    override fun myOnClick(data: String, view: View) {
        bundle = bundleOf("data" to data)
        Navigation.findNavController(view).navigate(R.id.action_BussinessOfficeFragment_to_OperationalExpensesFragment, bundle)
//        Navigation.findNavController(view).navigate(R.id.action_BussinessOfficeFragment_to_OperationalExpensesFragment)
    }

}
