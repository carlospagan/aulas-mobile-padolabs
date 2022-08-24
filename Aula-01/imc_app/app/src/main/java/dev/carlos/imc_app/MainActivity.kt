package dev.carlos.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pesoValue = findViewById<EditText>(R.id.peso)
        val alturaValue = findViewById<EditText>(R.id.altura)
        val btnCalcula = findViewById<Button>(R.id.calcular)
        val resultado = findViewById<TextView>(R.id.resultado)

        btnCalcula.setOnClickListener {
            val peso = pesoValue.text.toString()
            val altura = alturaValue.text.toString()

            if(!pesoValue.text.isEmpty() && !alturaValue.text.isEmpty()){
                val imc = peso.toDouble() / (altura.toDouble() * altura.toDouble())
                val imcFormatado = (imc * 1000.0).roundToInt() / 1000.0
                resultado.setText("IMC: " + imcFormatado)
            } else {
                resultado.setText("Por favor preencha todos os campos")
            }

        }
    }
}