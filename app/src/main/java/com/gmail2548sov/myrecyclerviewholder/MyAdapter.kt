package com.gmail2548sov.myrecyclerviewholder

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_point.view.*

class MyAdapter(private val points: ArrayList<String>): RecyclerView.Adapter<MyAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MyHolder(layoutInflater.inflate(R.layout.item_point, parent,false))
    }

    override fun getItemCount(): Int {
        return points.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(position)
    }

    inner class MyHolder(val view: View): RecyclerView.ViewHolder(view){
        fun bind(posit:Int){
        view.title.text = points[posit]
        }

    }


}