package com.example.bottomsheetactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var list: MutableList<String>): RecyclerView.Adapter<RecyclerAdapter.InerClass>() {
    class InerClass(item: View):RecyclerView.ViewHolder(item) {

        var tvtitle = item.findViewById<TextView>(R.id.tvTitle)
        var subtitle = item.findViewById<TextView>(R.id.tvSubtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.album_rv_item4,parent,false)
        return InerClass(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        holder.apply {
            tvtitle.text = list[position]
            subtitle.text = list[position]
        }
    }
}