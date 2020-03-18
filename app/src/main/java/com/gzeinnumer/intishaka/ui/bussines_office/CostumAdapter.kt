package com.gzeinnumer.intishaka.ui.bussines_office

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.gzeinnumer.intishaka.R
import com.gzeinnumer.intishaka.model.MyData

class CostumAdapter(val contex: Context, val userList: ArrayList<MyData>,
                    private val listener: OperationalFragment) : RecyclerView.Adapter<CostumAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)
        return  MyHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val user: MyData =  userList[position]
        holder.textTitle?.text    = user.title
        holder.textSubs?.text = user.sub

        holder.add.setOnClickListener {
//            val action = OperationalFragmentDirections.
            listener.myOnClick(user.title, it)
        }
    }

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textTitle =  itemView.findViewById(R.id.tv_title) as TextView
        val textSubs =  itemView.findViewById(R.id.tv_sub) as TextView
        val add =  itemView.findViewById(R.id.add) as ImageView
    }
}