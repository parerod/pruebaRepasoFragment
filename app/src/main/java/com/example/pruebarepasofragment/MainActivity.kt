package com.example.pruebarepasofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //lateinit var etiqueta: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 =findViewById<Button>(R.id.button1)
        val boton2 =findViewById<Button>(R.id.button2)
        val boton3 =findViewById<Button>(R.id.button3)
        val etiqueta=findViewById<TextView>(R.id.textView)



    }
}