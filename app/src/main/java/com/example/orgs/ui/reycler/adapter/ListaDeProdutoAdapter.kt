package com.example.orgs.ui.reycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto

class ListaDeProdutoAdapter (
    private val context: Context,
    private val produto: List<Produto>
) : RecyclerView.Adapter<ListaDeProdutoAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(produto: Produto) {
            val title = itemView.findViewById<TextView>(R.id.title);
            val description = itemView.findViewById<TextView>(R.id.description);
            val price = itemView.findViewById<TextView>(R.id.price);

            title.text = produto.name;
            description.text = produto.description;
            price.text = produto.price.toPlainString();
        }
    };

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflader = LayoutInflater.from(context);
        val view = inflader.inflate(R.layout.produto_item, parent, false);

        return viewHolder(view);
    }

    override fun getItemCount(): Int {
        return produto.size
    };

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val produto = produto[position];
        holder.vincula(produto)
    }

}
