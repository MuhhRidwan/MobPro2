package org.d3if0023.mymodul1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.d3if0023.mymodul1.data.Mahasiswa
import org.d3if0023.mymodul1.databinding.ItemMainBinding

class MainAdapter : ListAdapter<Mahasiswa, MainAdapter.ViewHolder>(DIFF_CALLBACK) {
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Mahasiswa>() {
            override fun areItemsTheSame(
                oldData: Mahasiswa, newData: Mahasiswa
            ): Boolean {
                return oldData.id == newData.id
            }
            override fun areContentsTheSame(
                oldData: Mahasiswa, newData: Mahasiswa
            ): Boolean {
                return oldData == newData
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMainBinding.inflate(inflater, parent, false)
        return RecyclerView.ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}