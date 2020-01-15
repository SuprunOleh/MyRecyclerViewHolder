package com.gmail2548sov.myrecyclerviewholder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class FragmentList: Fragment() {





    var point: ArrayList<String> = ArrayList()
    val myAdapter: MyAdapter = MyAdapter(point)
    lateinit var myrecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        myrecyclerView = view.findViewById(com.gmail2548sov.myrecyclerviewholder.R.id.myrecycler)
        myrecyclerView.setHasFixedSize(true)
        myrecyclerView.layoutManager = LinearLayoutManager(context)
        myrecyclerView.adapter = myAdapter

        view.add.setOnClickListener {
            var input = view.findViewById<EditText>(R.id.input).text.toString()
            point.add(input)
            myAdapter.notifyDataSetChanged()
            myrecyclerView.scrollToPosition(point.size-1)
        }
        return view
    }

    /*fun listItem(): ArrayList<String> {
        //for (i in 1..50) {
          //  point.add((i*2).toString())
        //}
        return point
    }*/






    }

