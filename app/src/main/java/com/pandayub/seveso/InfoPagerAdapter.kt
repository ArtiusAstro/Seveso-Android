package com.pandayub.seveso

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SlidePagerStateAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val infos: ArrayList<InfoData>

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return InfoCard.newInstance()
    }

}