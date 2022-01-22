package com.metehanbolat.kotlinscopefunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.kotlinscopefunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var number: Int? = null

    private var i = 0

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

        // If we use "apply" when we are going to use more than one property or one property of a class many times, ..
        // .. we do not need to use the object of the class each time.
        val intent = Intent().apply {
            putExtra("", "")
            putExtra("", 0)
            action = ""
        }

        // "run" works like "apply". But when we use "run", if we want to assign a variable or value, ..
        // .. we must return the type we want in the last line, otherwise it will be unit.
        val intent2 = Intent().run {
            putExtra("", "")
            putExtra("", 0)
            action = ""
            this
        }

    }

    // We can use "also" for what we want done after an any operation.
    fun getSquaredI() = (i * i).also {
        i++
    }
}