package com.gzeinnumer.intishaka.ui.bussines_office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.gzeinnumer.intishaka.R
import com.gzeinnumer.intishaka.model.MyData
import kotlinx.android.synthetic.main.fragment_operational.view.*

class OperationalFragment : Fragment() {
    var data = ArrayList<MyData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_operational, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data.add(MyData("Transportation", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Hotel", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Daily Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Meal Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        data.add(MyData("Gasoline Allowance", "11 Januari 2020 Plane 500.000\n11 Januari 2020 Plane 500.000"))
        view.rv.apply{
            adapter = CostumAdapter(view.context,data)
            layoutManager = LinearLayoutManager(view.context)
            hasFixedSize()
        }
    }

}
