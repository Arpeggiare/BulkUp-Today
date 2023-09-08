package com.example.bulkup_today.View.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bulkup_today.Model.ContentsData
import com.example.bulkup_today.databinding.ActivityContentsBinding
import com.example.bulkup_today.databinding.ItemContentsListBinding

class ContentsRecyclerAdapter: RecyclerView.Adapter<ContentsRecyclerAdapter.ContentsViewHolder>() {

    var datalist = ArrayList<ContentsData>()
    inner class ContentsViewHolder(private val binding: ItemContentsListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(contentsData:ContentsData) {

            binding.contentsTitle.text = contentsData.contents_title
            binding.contentsHashTag.text = contentsData.contents_message
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentsViewHolder {
        val binding = ItemContentsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentsViewHolder(binding)
    }

    fun setContentsList(list: ArrayList<ContentsData>) {
        this.datalist = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = datalist.size

    override fun onBindViewHolder(holder: ContentsViewHolder, position: Int) {
        holder.bind(datalist[position])
    }
}