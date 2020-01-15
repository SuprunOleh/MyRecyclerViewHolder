package com.gmail2548sov.myrecyclerviewholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        val mFragmentManager = supportFragmentManager
        val mFragmentList = FragmentList()

        //var point: ArrayList<String> = ArrayList()
        //val myAdapter: MyAdapter = MyAdapter(listItem())
        //lateinit var myrecyclerView: RecyclerView
        //private lateinit var myrecyclerView: RecyclerView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main_)

            val fragment: Fragment? = mFragmentManager.findFragmentById(R.id.container)

            if (fragment == null) {
                mFragmentManager.beginTransaction().add(R.id.container, mFragmentList).commit()
            }














           /* myrecyclerView = findViewById(com.gmail2548sov.myrecyclerviewholder.R.id.myrecycler)
            myrecyclerView.setHasFixedSize(true)
            myrecyclerView.layoutManager = LinearLayoutManager(this)
            myrecyclerView.adapter = myAdapter*/

        }

        /*fun listItem(): ArrayList<String> {
            for (i in 1..50) {
                point.add(i.toString())
            }
            return point
        }*/
    }

