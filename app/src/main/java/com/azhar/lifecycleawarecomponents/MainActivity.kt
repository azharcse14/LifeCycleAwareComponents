package com.azhar.lifecycleawarecomponents

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())

        Log.d("MAIN", "ACTIVITY OnCREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN", "ACTIVITY onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "ACTIVITY onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "ACTIVITY onDestroy")
    }
}