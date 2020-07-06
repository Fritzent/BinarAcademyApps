package com.example.binaracademyapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.binar_main_menu_section.view.*

class Adapter(private  val menu:List<MenuList>) :
    RecyclerView.Adapter<Adapter.Holder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.binar_main_menu_section,parent,false))
    }

    override fun getItemCount(): Int = menu.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindSecondMenu(menu[position])

        val checkMenuSatu = 1
        when {
            checkMenuSatu == position -> {
                holder.itemView.MenuLayoutBackground.setBackgroundResource(R.drawable.main_career_background)
                holder.itemView.ImageMenu.setBackgroundResource(R.drawable.career)
            }
            checkMenuSatu - 1 == position -> {
                holder.itemView.MenuLayoutBackground.setBackgroundResource(R.drawable.main_academy_background)
                holder.itemView.ImageMenu.setBackgroundResource(R.drawable.academy)
            }
            checkMenuSatu + 1 == position -> {
                holder.itemView.MenuLayoutBackground.setBackgroundResource(R.drawable.main_retrospekt_background)
                holder.itemView.ImageMenu.setBackgroundResource(R.drawable.retrospek)
            }
        }
    }

    class Holder( view: View) : RecyclerView.ViewHolder(view){
        private val secondMenuText = view.SecondMenuText
        private val firstMenuText = view.FirstMenuText
        private val menuImage = view.ImageMenu

        fun bindSecondMenu(MenuList: MenuList){
            firstMenuText.text = MenuList.menuFirstName
            secondMenuText.text = MenuList.menuSecondName
            Picasso.get().load(MenuList.imageMenu).into(menuImage)
        }
    }
}