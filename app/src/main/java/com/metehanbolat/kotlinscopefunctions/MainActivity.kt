package com.metehanbolat.kotlinscopefunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.kotlinscopefunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var number: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Let is usually used for null check.

        // Even if we check for null with "if", a different kernel may access the variable and cause the application to crash.
        // Also, even if we checked for null, the variable is still nullable.
        if (number != null) {
            val number2 = number + 1
        }
        // That's why we have to use "Let"
        // We can also declare the let block as a value.
        // The last line of the let block will act as a return.
        // Also we can use elvis operator with let block.
        val x = number?.let {
            val number2 = it + 1
            number2
        } ?: 3
    }
}