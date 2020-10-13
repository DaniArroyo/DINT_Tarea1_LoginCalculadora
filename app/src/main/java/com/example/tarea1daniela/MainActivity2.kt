package com.example.tarea1daniela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        super.onResume()

        var nombre:String = intent.getStringExtra("usuario").toString()
        var apellido:String = intent.getStringExtra("apellido").toString()

        var textViewHola = findViewById<TextView>(R.id.textView)

        textViewHola.text = "Hola " + nombre + " " +  apellido
    }

    fun numeros(view: View) {
        if (isNewOp == true) {
            textViewResultado.setText("")
        }
        isNewOp=false

        val buSelect = view as Button
        var Valor: String = textViewResultado.text.toString()

        when (buSelect.id) {
            btn0.id -> {
                Valor += "0"
            }
            btn1.id -> {
                Valor += "1"
            }
            btn2.id -> {
                Valor += "2"
            }
            btn3.id -> {
                Valor += "3"
            }
            btn4.id -> {
                Valor += "4"
            }
            btn5.id -> {
                Valor += "5"
            }
            btn6.id -> {
                Valor += "6"
            }
            btn7.id -> {
                Valor += "7"
            }
            btn8.id -> {
                Valor += "8"
            }
            btn9.id -> {
                Valor += "9"
            }
            btnDecimal.id -> {
                Valor += "."
            }
        }
        textViewResultado.setText(Valor)
    }

    var operador = "+"
    var oldNumber = ""
    var isNewOp=true;
    fun operar(view: View) {
        var buClickValue: String = textViewResultado.text.toString()
        val botonOperador= view as Button
        when (botonOperador.id) {
            btnSumar.id -> {
                operador = "+"
            }
            btnRestar.id -> {
                operador = "-"
            }
            btnMultiplicar.id -> {
                operador = "*"
            }
            btnDividir.id -> {
                operador = "/"
            }
        }
        oldNumber = textViewResultado.text.toString()
        isNewOp = true
    }

    fun igual(view: View){
        val newNumber = textViewResultado.text.toString()
        var finalNumber: Double?=null
        when(operador){
            "+"->{
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "/"->{
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "*"->{
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()

            }
            "-"->{
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
        }
        textViewResultado.setText(finalNumber.toString())
        isNewOp=true
    }

    fun borrar(view: View){
        oldNumber = ""
        textViewResultado.text = ""
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

}
