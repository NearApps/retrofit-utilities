package com.nearapps.utilities.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nearapps.library.utilities.retrofit.Demo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demo :Demo = Demo()
        demo.printDemo()

    }
}