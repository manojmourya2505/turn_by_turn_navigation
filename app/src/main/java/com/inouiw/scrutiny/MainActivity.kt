package com.inouiw.scrutiny

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inouiw.scrutiny.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainBinding.root)

        mMainBinding.btClickMe.setOnClickListener {
            mMainBinding.tvMessage.text = resources.getString(R.string.hi_scrutiny)
        }
    }
}