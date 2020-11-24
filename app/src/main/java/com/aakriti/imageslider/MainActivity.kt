package com.aakriti.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imagesList:Array<Int> = arrayOf(R.drawable.desiaroma,R.drawable.pizzaahut,R.drawable.toshib)
        var adapter: PagerAdapter =SliderAdapter(applicationContext,imagesList)
        viewPager.adapter=adapter
    }
}