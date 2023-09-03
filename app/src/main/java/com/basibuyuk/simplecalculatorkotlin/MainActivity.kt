package com.basibuyuk.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.basibuyuk.simplecalculatorkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var num1: Int? = null
    var num2: Int? = null
    var result: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun mySum(view: View) {
        num1 = binding.editText1.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) {
            binding.result.text = "Error!"
        } else {
            result = num1!! + num2!!
            binding.result.text = "Result: ${result}"
        }

    }

    fun mySub(view: View) {
        num1 = binding.editText1.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) {
            binding.result.text = "Error!"
        } else {
            result = num1!! - num2!!
            binding.result.text = "Result: ${result}"
        }
    }


    fun myMultiply(view: View) {

        num1 = binding.editText1.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) {
            binding.result.text = "Error!"
        } else {
            result = num1!! * num2!!
            binding.result.text = "Result: ${result}"
        }
    }

    fun myDiv(view: View) {
        num1 = binding.editText1.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) {
            binding.result.text = "Error!"
        } else {
            result = num1!! / num2!!
            binding.result.text = "Result: ${result}"
        }
    }


}