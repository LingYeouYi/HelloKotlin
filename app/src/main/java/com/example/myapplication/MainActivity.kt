package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.time.measureTimedValue

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //on Create = main function
        super.onCreate(savedInstanceState)
        //Display the UI.R = resources
        setContentView(R.layout.activity_main)
        //val = value(fix content), var = variable(change able content)
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener{showName()}
    }

    private fun showName(){
        textViewName.setText("Your name here")
    }
}
