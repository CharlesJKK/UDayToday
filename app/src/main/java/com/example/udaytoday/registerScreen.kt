package com.example.udaytoday

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.udaytoday.databinding.ActivityRegisterScreenBinding

class registerScreen : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val iconBack = binding.backBtn
        val alreadyRegistered = binding.alreadyRegistered
        alreadyRegistered.paintFlags = alreadyRegistered.paintFlags or Paint.UNDERLINE_TEXT_FLAG;

        val onClickListener = View.OnClickListener { view ->
            when(view.id){
                R.id.already_registered -> {
                    val navigationToMain = Intent(this, MainActivity::class.java)
                    startActivity(navigationToMain)
                }
                R.id.back_btn -> {
                    val navigationToMain = Intent(this, MainActivity::class.java)
                    startActivity(navigationToMain)
                }
            }
        }

        iconBack.setOnClickListener(onClickListener)
        alreadyRegistered.setOnClickListener(onClickListener)

    }
}