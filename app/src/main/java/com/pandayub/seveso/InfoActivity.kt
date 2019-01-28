package com.pandayub.seveso

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import InfoData

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        setupViewPager()
    }

    /**
     * Sets up the info viewpager
     */
    private fun setupViewPager() {
        val infos: Array<InfoData> = arrayOf(
            InfoData("png","Civil Defence: An Overview"),
            InfoData("png","Oil Reservoir Dangers: An Overview"),
            InfoData("png","This Application: Description And Goals")
        )

        Log.e("SetupViewPager", "loaded")
        val viewPager = findViewById<ViewPager>(R.id.start_info_viewpager)
        val adapter = InfoPagerAdapter(supportFragmentManager, infos)
        viewPager.setPageTransformer(true, ZoomOutPageTransformer())
        viewPager.adapter = adapter
    }
}
