package com.example.fragmentanimationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentanimationandroid.databinding.ActivityMainBinding
import com.example.fragmentanimationandroid.fragments.FirstFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, FirstFragment())
            .commit()

    }
}