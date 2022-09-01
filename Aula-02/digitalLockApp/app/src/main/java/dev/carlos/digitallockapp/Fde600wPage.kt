package dev.carlos.digitallockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.appbar.MaterialToolbar

class Fde600wPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fde600w_page)

        val mainToolBar = findViewById<MaterialToolbar>(R.id.mainToolBar)

        val homeImg = findViewById<ImageView>(R.id.home)
        homeImg.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
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