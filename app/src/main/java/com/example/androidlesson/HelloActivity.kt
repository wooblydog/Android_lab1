package com.example.androidlesson

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlesson.databinding.HelloActBinding


class HelloActivity:AppCompatActivity() {

    private lateinit var binding: HelloActBinding
    private lateinit var hwTextView : TextView
    private lateinit var btnOnView : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HelloActBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hwTextView = binding.hw
        btnOnView = binding.btn
        hwTextView.visibility = View.INVISIBLE
    }

    fun click(view : View){
        hwTextView.visibility = View.VISIBLE
    }
}


