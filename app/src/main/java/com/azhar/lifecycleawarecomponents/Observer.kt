package com.azhar.lifecycleawarecomponents

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("MAIN", "OBSERVER - ON CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d("MAIN", "OBSERVER - ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d("MAIN", "OBSERVER - onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d("MAIN", "OBSERVER - ON_PAUSE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d("MAIN", "OBSERVER - ON_STOP")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d("MAIN", "OBSERVER - ON_DESTROY")
    }

}