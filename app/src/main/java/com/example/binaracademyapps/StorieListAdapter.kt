package com.example.binaracademyapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.binar_storie_item_section.view.*

class StorieListAdapter (private val item:List<StorieList>): RecyclerView.Adapter<StorieListAdapter.Holder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.binar_storie_item_section,parent,false))
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.storieListMenu(item[position])
    }

    class Holder( view: View) : RecyclerView.ViewHolder(view){
        private val imageView = view.StorieImage
        private val titleView = view.StorieTitle
        private val dateView = view.StorieDate

        fun storieListMenu(StorieList: StorieList){
            Picasso.get().load(StorieList.imageViewStorie).into(imageView)
            titleView.text = StorieList.titleViewStorie
            dateView.text = StorieList.dateViewStorie
        }
    }
}