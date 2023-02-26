package com.zmei.orientation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.orientation.databinding.ActivityMainBinding
import constants.constant

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


            constant.dvornik -> {
            val tempText = "ваша зарплата ${constant.dvornik_currency} долларов"
            if(bindingClass.editText3?.text.toString() == constant.dvornik_parol)
            bindingClass.text1.text = tempText}

            constant.director ->{
            val tempText = "ваша зарплата ${constant.director_currency} долларов"
            if(bindingClass.editText3?.text.toString()==constant.director_parol)
            bindingClass.text1.text = tempText}

        else -> {

        bindingClass.text1.text = "нет такого работника"
        }
        }

    }


    }

    }
