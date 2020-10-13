package com.example.tarea1daniela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun entrar(view: View){

        var editTextNombre = findViewById<EditText>(R.id.editTextNombre)
        var editTextApellido = findViewById<EditText>(R.id.editTextApellido)

        var nombre:String = editTextNombre.text.toString()
        var apellido:String = editTextApellido.text.toString()

            var miIntent = Intent(this, MainActivity2::class.java)

            miIntent.putExtra("usuario", nombre)
            miIntent.putExtra("apellido", apellido)

            startActivity(miIntent)

        }


    fun salir(view: View){
        finish()
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