package com.aakriti.imageslider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter: PagerAdapter {
    var context:Context
    var imagesList:Array<Int>
    lateinit var layoutInflater:LayoutInflater
    constructor(context: Context, imagesList:Array<Int>){
        this.context=context
        this.imagesList=imagesList
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean=view ==`object` as RelativeLayout

    override fun getCount(): Int =imagesList.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var image:ImageView
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        var view:View=layoutInflater.inflate(R.layout.slider_image_item,container,false)
        image=view.findViewById(R.id.slider_image_xml)
        image.setImageResource(imagesList[position])
        container!!.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView(`object`as RelativeLayout)
    }
}