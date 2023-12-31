package com.example.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.orgs.R
import com.example.orgs.model.Produto
import java.math.BigDecimal

class formProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_product)

        val buttonSave = findViewById<Button>(R.id.ButtonSalvar);

        buttonSave.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.name);
            val campoDescription = findViewById<EditText>(R.id.description);
            val campoPrice = findViewById<EditText>(R.id.price);

            val nome = campoNome.text.toString();
            val description = campoDescription.text.toString();
            val priceText = campoPrice.text.toString();

            val price = if(priceText.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(priceText)
            }



            val newProduct = Produto(
                name = nome,
                description = description,
                price = price
            )

            Log.i("produto", "produto: ${newProduct.price}")
        }


    }



}