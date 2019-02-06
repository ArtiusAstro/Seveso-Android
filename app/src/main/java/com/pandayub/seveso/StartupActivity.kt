package com.pandayub.seveso

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class StartupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)

        Handler().postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            this.applicationContext.startActivity(intent)
        }, 3000)
    }
}
