package ir.umut.multiThreadingKotlin

import android.util.Log

class Thread2:Runnable {
    override fun run() {
        // do work =>
        Log.v("testThread",Thread.currentThread().name)
    }
}