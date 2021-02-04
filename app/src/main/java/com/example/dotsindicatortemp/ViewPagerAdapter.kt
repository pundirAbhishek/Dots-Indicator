package com.example.dotsindicatortemp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.dotsindicatortemp.R

class ViewPagerAdapter : PagerAdapter() {

  override fun instantiateItem(container: ViewGroup, position: Int): Any {
    val item = LayoutInflater.from(container.context).inflate(
      R.layout.material_page, container,
            false)
    container.addView(item)
    return item
  }

  override fun getCount(): Int {
    return 2
  }

  override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return view === `object`
  }

  override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
    container.removeView(`object` as View)
  }
}
