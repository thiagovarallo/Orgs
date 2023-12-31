package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView.RecyclerListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.reycler.adapter.ListaDeProdutoAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.adapter = ListaDeProdutoAdapter()


    }
}