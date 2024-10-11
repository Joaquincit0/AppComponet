package com.example.orellano

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {




private  lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalcular.setOnClickListener(this)
                }

    override fun onClick(p0: View?) {
        val minutos = minText.text.toString().toIntOrNull() ?: 0
        val costo = buttonCalcular(minutos)
        mostrarResultado(costo)
    }

}