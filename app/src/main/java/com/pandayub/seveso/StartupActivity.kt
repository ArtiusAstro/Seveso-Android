package com.pandayub.seveso

import android.content.Intent
import com.pandayub.seveso.Info.InfoActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class StartupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)

        Handler().postDelayed({
            val intent = Intent(this, InfoActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            this.applicationContext.startActivity(intent)
        }, 3000)
    }
}
