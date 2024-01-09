package com.example.tuan32.Tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.tuan32.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter?=null
    var ls: ArrayList<Tuan312Contact> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)

        var lv=findViewById<ListView>(R.id.tuan312lv)

        ls.add(Tuan312Contact("Nguyen Van Tuan", "18", R.drawable.android))
        ls.add(Tuan312Contact("Nguyen Van Hai", "18", R.drawable.apple))
        ls.add(Tuan312Contact("Nguyen Van Thu", "18", R.drawable.dell))
        ls.add(Tuan312Contact("Nguyen Van Hung", "18", R.drawable.hp))
        ls.add(Tuan312Contact("Nguyen Van Dung", "18", R.drawable.android))

        adap= Tuan312Adapter(this, ls)
        lv.adapter=adap
    }
}