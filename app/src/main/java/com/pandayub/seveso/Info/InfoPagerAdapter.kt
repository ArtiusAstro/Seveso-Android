package com.pandayub.seveso.Info

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class InfoPagerAdapter(fm: FragmentManager, private val infos: Array<InfoData>) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return infos.size
    }

    override fun getItem(position: Int): Fragment {
        return InfoCard.newInstance(infos[position], position)
    }

}