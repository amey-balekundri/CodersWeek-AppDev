package com.example.navigateactivities.adapters



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import com.example.navigateactivities.R
import com.example.navigateactivities.model.CharItem

class AlphaAdapters(var context: Context, var arrayList: ArrayList<CharItem>) :
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout_list_item, parent, false)
        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val charItem: CharItem = arrayList.get(position)

        holder.icons.setImageResource(charItem.icons!!)
        holder.titles.text = charItem.alpha

        holder.titles.setOnClickListener {
            Toast.makeText(context, charItem.alpha, Toast.LENGTH_SHORT).show()

        }
        holder.icons.setOnClickListener {
            Toast.makeText(context, charItem.alpha, Toast.LENGTH_SHORT).show()
        }

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var titles = itemView.findViewById<TextView>(R.id.title_text_view)

    }
}