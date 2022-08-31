package dev.carlos.digitallockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainToolBar = findViewById<MaterialToolbar>(R.id.mainToolBar)
        mainToolBar.setNavigationOnClickListener{
            Toast.makeText(this,"Hamburguer Pressionado!!!",Toast.LENGTH_SHORT).show()
        }

        val fde600wCard = findViewById<CardView>(R.id.fde600wCard)
        fde600wCard.setOnClickListener{
            startActivity(Intent(this,Fde600wPage::class.java))
        }

        mainToolBar.setOnMenuItemClickListener{ menuItem ->
            when(menuItem.itemId) {
                R.id.menu_item_notifications -> {
                    Toast.makeText(this, "Ir para a página de notificações!!", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_item_cart -> {
                    Toast.makeText(this, "Ir para a página do carrinho!!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }



}