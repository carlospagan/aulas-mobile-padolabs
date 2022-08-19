package dev.carlos.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editNome = findViewById<EditText>(R.id.editNome)
        val txtMessage = findViewById<TextView>(R.id.textView)
        val btnOk = findViewById<Button>(R.id.btnOk)

        btnOk.setOnClickListener {
            if (editNome.text.isEmpty()) {
                txtMessage.setText("Por favor, informe seu nome!")
            }else{
                txtMessage.setText("Olá "+editNome.text.trim() + " , seja bem-vindo ao mundo mobile!")
            }
        }
    }
}

