package com.example.pruebarepasofragment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.pruebarepasofragment.R

class Fragment1 : Fragment() {

    companion object {
        fun newInstance() = Fragment1()
    }

    //private lateinit var viewModel: Fragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Mi codigo

        val vista:View=inflater.inflate(R.layout.fragment1, container, false)
        val boton1 = vista.findViewById<Button>(R.id.f1IrMorado)
        val boton2 = vista.findViewById<Button>(R.id.buttonMultiplica)
        val etiqueta = vista.findViewById<TextView>(R.id.f1Valor)

        boton1?.setOnClickListener() {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }

        return vista
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}