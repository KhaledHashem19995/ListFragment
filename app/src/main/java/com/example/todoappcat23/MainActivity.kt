package com.example.todoappcat23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todoappcat23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //this is a dynamic fragment that  will be in our
        //replacing any other fragment right there
        supportFragmentManager.beginTransaction()
                  //(BOOK                , PAGE                         )
            .replace(R.id.container_frag,CountriesFragment.newInstance())
            .addToBackStack("countries")
            .commit()
    }
}