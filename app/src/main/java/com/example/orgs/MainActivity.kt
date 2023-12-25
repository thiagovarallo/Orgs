package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        val title = findViewById<TextView>(R.id.title);
        val descritions = findViewById<TextView>(R.id.description);
        val price = findViewById<TextView>(R.id.price);


        title.text = "Cesta de fruta";
        descritions.text = "Uva, laranja, maça";
        price.text = "19.99"

        
    }
}