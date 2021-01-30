package com.example.myhomework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_b_m_i.*
import kotlinx.android.synthetic.main.activity_main.*

class BMIActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatebutton.setOnClickListener {
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = w/(h*h)
            result.text = "%.2f".format(res)
        }
    }
}