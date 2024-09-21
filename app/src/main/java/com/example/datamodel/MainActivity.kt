package com.example.datamodel

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.datamodel.databinding.ActivityMainBinding
import com.example.datamodel.viewmodel.CVM

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val cvm:CVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.ctxt.text = cvm.c.toString()
        binding.icbtn.setOnClickListener {
            cvm.incrementC()
            binding.ctxt.text= cvm.c.toString()
        }
        binding.dcbtn.setOnClickListener {
            cvm.decrementC()
            binding.ctxt.text= cvm.c.toString()
        }

    }
}