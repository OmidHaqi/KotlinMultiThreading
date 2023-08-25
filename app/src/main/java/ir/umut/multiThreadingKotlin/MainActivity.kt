package ir.umut.multiThreadingKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //method 0 => main Thread.
    //by default mainActivity is mainThread.

        Log.v("testThread",Thread.currentThread().name)



    //method 1 => create class
        val thread1 = Thread1()
        thread1.start()

    //method 2 => runnable interface
        val thread2 = Thread(Thread2())
        thread2.start()

    //method 3 => object anonymous
        val thread3 = Thread(object :Runnable{
            override fun run() {
                Log.v("testThread",Thread.currentThread().name)
            }

        })
        thread3.start()

    }
}