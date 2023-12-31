package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.reycler.adapter.ListaDeProdutoAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        recyclerView.adapter = ListaDeProdutoAdapter(context = this, listOf(
            Produto(
                name = "teste",
                description = "teste 123",
                price = BigDecimal("12.78")
            ),
            Produto(
                name = "teste2",
                description = "teste 12",
                price = BigDecimal("78.78")
            ),Produto(
                name = "teste 38",
                description = "teste 12",
                price = BigDecimal("78.78")
            ),
        ))

        recyclerView.layoutManager = LinearLayoutManager(this);

    }
}