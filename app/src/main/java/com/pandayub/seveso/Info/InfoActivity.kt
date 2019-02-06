package com.pandayub.seveso.Info

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

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
            InfoData(
                "png",
                "Civil Defence: An Overview",
                "THis is a sample text for the FIRST one THis is a sample text for the FIRST one THis is a sample text for the FIRST one THis is a sample text for the FIRST one "
            ),
            InfoData(
                "png",
                "Oil Reservoir Dangers: An Overview",
                "THis is a sample text for the SECOND one THis is a sample text for the SECOND one THis is a sample text for the SECOND one THis is a sample text for the SECOND one "
            ),
            InfoData(
                "png",
                "This Application: Description And Goals",
                "THis is a sample text for the THIRD one THis is a sample text for the THIRD one THis is a sample text for the THIRD one THis is a sample text for the THIRD one "
            ),
            InfoData(
                "png",
                "This Application: Description And Goals",
                "THis is a sample text for the THIRD one THis is a sample text for the THIRD one THis is a sample text for the THIRD one THis is a sample text for the THIRD one "
            )
            )

        Log.e("SetupViewPager", "loaded")
        val viewPager = findViewById<ViewPager>(R.id.start_info_viewpager)
        val adapter = InfoPagerAdapter(supportFragmentManager, infos)
        viewPager.setPageTransformer(true, ZoomOutPageTransformer())
        viewPager.adapter = adapter
    }
}
