package com.gzeinnumer.intishaka.ui.meeting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.gzeinnumer.intishaka.R
import kotlinx.android.synthetic.main.fragment_meeting.view.*

class MeetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meeting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.menu_agreement.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_MeetingFragment_to_MeetingFormFragment)
        }
    }

}
