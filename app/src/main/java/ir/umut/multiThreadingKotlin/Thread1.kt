package ir.umut.multiThreadingKotlin

import android.util.Log

class Thread1:Thread() {
    override fun run() {
        super.run()

    // do work
    Log.v("testThread",Thread.currentThread().name)
    }
}