package com.backtocding.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "Logging: MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: MainActivity")
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val sampleFragment = SampleFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, sampleFragment).commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: MainActivity")
    }
}