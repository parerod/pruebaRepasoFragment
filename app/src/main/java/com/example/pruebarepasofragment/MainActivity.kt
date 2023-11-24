package com.example.pruebarepasofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController

class MainActivity : AppCompatActivity() {

    //lateinit var etiqueta: TextView
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 =findViewById<Button>(R.id.button1)
        val boton2 =findViewById<Button>(R.id.button2)
        val boton3 =findViewById<Button>(R.id.button3)
        val etiqueta=findViewById<TextView>(R.id.textView)

        boton1.setOnClickListener() {
            navController= findNavController(R.id.fragmentContainerView)
            navController.navigate(R.id.fragment1)

        }
        boton2.setOnClickListener() {
            navController= findNavController(R.id.fragmentContainerView)
            navController.navigate(R.id.fragment2)
        }
        boton3.setOnClickListener() {
            navController= findNavController(R.id.fragmentContainerView)
            navController.navigate(R.id.fragment35)
        }



    }
}