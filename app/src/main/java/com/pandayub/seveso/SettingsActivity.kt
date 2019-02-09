package com.pandayub.seveso

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView

class SettingsActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.sidebarHome -> {
                val intent = Intent(this, SettingsActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
            R.id.sidebarActions -> {
                val intent = Intent(this, ActionsActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
            R.id.sidebarInfo -> {
                val intent = Intent(this, ScrollInfoActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
            R.id.sidebarMap -> {
                val intent = Intent(this, MapActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
            R.id.sidebarPhone -> {
                val intent = Intent(this, ContactActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
            R.id.sidebarSettings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                this.applicationContext.startActivity(intent)
            }
        }

        return true
    }


}
