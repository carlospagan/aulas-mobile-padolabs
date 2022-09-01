package dev.carlos.digitallockapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar

class Fde300wPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fde300w_page)

        val mainToolBar = findViewById<MaterialToolbar>(R.id.mainToolBar)

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