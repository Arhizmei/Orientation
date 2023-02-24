package com.zmei.orientation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.orientation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    bindingClass.button1.setOnClickListener {

        var editReader = bindingClass.editText1.text.toString()
        bindingClass.text1.visibility = View.VISIBLE
        when (editReader) {

            "andrey" -> bindingClass.text1.text = "ваша зарплата 500 долларов"
            "vadim" -> bindingClass.text1.text = "вашаш зарплата 1000 долларов"

        else -> {

        bindingClass.text1.text = "нет такого работника"

        }}

    }
    }

    }
