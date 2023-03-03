package com.example.udaytoday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.udaytoday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.registerBtn.setOnClickListener {
            val navigationToRegister = Intent(this, registerScreen::class.java)
            startActivity(navigationToRegister)
        }

        val loginBtn = binding.loginBtn

        loginBtn.setOnClickListener {
            login()
        }
    }
    private fun login(){

        val usernameField = binding.usernameLogin.text.toString()
        val passwordField = binding.passwordLogin.text.toString()
        var errorTxt = binding.emptyFields

        if (usernameField == "" || passwordField == ""){
            errorTxt.visibility = View.VISIBLE
            return
        }else{
            val navigationToHome = Intent(this, HomeActivity::class.java)
            startActivity(navigationToHome)
        }
    }
}