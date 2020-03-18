package com.gzeinnumer.intishaka.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.gzeinnumer.intishaka.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.menu_bussines_bisnis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_HomeFragment_to_HomeSecondFragment)
        }
        view.menu_meeting.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_HomeFragment_to_MeetingFragment)
        }
    }
}
