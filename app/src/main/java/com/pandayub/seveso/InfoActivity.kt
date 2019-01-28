package com.pandayub.seveso

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    /**
     * Sets up the info viewpager
     */
    private fun setupViewPager() {
        Log.e("SetupViewPager", "loaded")
        val viewPager = findViewById<ViewPager>(R.id.info_pager)
        val adapter = InfoPagerAdapter(supportFragmentManager)
        viewPager.setPageTransformer(true, ZoomOutPageTransformer())
        viewPager.offscreenPageLimit = 0
        viewPager.adapter = adapter
    }
}
