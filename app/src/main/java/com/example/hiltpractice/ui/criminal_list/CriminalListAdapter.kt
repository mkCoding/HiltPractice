package com.example.hiltpractice.ui.criminal_list

import android.sax.Element
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.hiltpractice.R
import com.example.hiltpractice.data.model.ItemModel
import com.example.hiltpractice.databinding.ElementCriminalBinding

class CriminalListAdapter(
    private val criminalList:List<ItemModel?>?
):RecyclerView.Adapter<CriminalListAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):ViewHolder(itemView){
        private val binding = ElementCriminalBinding.bind(itemView)

        fun updateUI(criminalItem:ItemModel?){
            //Handle UI changes based on current state
            binding.apply {
                Glide.with(itemView.context).load(criminalItem?.images?.get(0)?.original).placeholder(R.drawable.person_icon_new).into(ivCriminalPic) //criminal image
                tvCriminalName.text = criminalItem?.images?.get(0)?.caption //criminal name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.element_criminal, parent, false))    }

    override fun getItemCount(): Int = criminalList?.size?:0

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.updateUI(criminalList?.get(position))
    }

}

