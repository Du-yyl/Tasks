package com.example.tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasks.databinding.ActivityMainBinding

//import com.example.tasks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)


    }
}