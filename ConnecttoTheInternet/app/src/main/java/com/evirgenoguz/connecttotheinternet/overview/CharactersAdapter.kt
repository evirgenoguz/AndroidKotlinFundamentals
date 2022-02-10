package com.evirgenoguz.connecttotheinternet.overview


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.evirgenoguz.connecttotheinternet.databinding.CharacterCardDesignBinding
import com.evirgenoguz.connecttotheinternet.databinding.FragmentOverviewBinding
import com.evirgenoguz.connecttotheinternet.network.CharacterModel

class CharactersAdapter: ListAdapter<CharacterModel, CharactersAdapter.CharactersViewHolder>(DiffCallBack) {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharactersAdapter.CharactersViewHolder {
        return CharactersViewHolder(CharacterCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent  , false))
    }

    override fun onBindViewHolder(holder: CharactersAdapter.CharactersViewHolder, position: Int) {
        val character = getItem(position)
        holder.bind(character)
    }

    class CharactersViewHolder(private val binding: CharacterCardDesignBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(character: CharacterModel) {
            binding.characterModel = character
            binding.executePendingBindings()
        }
    }

    companion object DiffCallBack: DiffUtil.ItemCallback<CharacterModel>(){
        override fun areItemsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            return oldItem == newItem
        }

    }

}