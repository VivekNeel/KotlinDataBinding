package com.example.databinding

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.databinding.databinding.ListItemSchoolBinding

/**
 * Created by vivek on 29/05/17.
 */
class SchoolAdapter(var listOfSchool: ArrayList<School>) : RecyclerView.Adapter<SchoolAdapter.viewHolder>() {


    override fun onBindViewHolder(p0: viewHolder?, p1: Int) {
        var school: School = listOfSchool.get(p1)
        p0?.bind(school)

    }

    override fun getItemCount(): Int {
        return listOfSchool.size
    }

    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): viewHolder {
        var view: ListItemSchoolBinding = ListItemSchoolBinding.inflate(LayoutInflater.from(p0?.context), p0, false)
        return viewHolder(view)
    }


    class viewHolder(itemView: ListItemSchoolBinding) : RecyclerView.ViewHolder(itemView.root) {
        var binding: ListItemSchoolBinding = itemView;

        fun bind(objects: School) {
            binding.setVariable(BR.school, objects)
            binding.executePendingBindings()
            binding.setVariable(BR.click , ClickListener())
        }
    }
}