package com.example.udaytoday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.udaytoday.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragmente(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragmente(HomeFragment())
                R.id.reminder -> replaceFragmente(ReminderFragment())

                else -> {

                }

            }

            true
        }
    }

    private fun replaceFragmente(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frame_layout,fragment)
        fragmentTransition.commit()
    }
}