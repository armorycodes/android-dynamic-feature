package com.frogobox.research

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Call Module Core : ${CallModule.callCore}")
        Log.d("MainActivity", "Call Module Payment : ${CallModule.callPayment}")
        Log.d("MainActivity", "Call Module Security : ${CallModule.callSecurity}")

    }
}