package com.evirgenoguz.connecttotheinternet

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.evirgenoguz.connecttotheinternet.network.CharacterModel
import com.evirgenoguz.connecttotheinternet.network.HarryPotterApi
import com.evirgenoguz.connecttotheinternet.overview.CharactersAdapter
import com.evirgenoguz.connecttotheinternet.overview.HarryPotterApiStatus


@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<CharacterModel>?) {
    val adapter = recyclerView.adapter as CharactersAdapter
    adapter.submitList(data)
}

@BindingAdapter("harryPotterApiStatus")
fun bindStatus(statusImageView: ImageView, status: HarryPotterApiStatus?) {

    when (status) {
        HarryPotterApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            println("Yükleniyor")
        }

        HarryPotterApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
            println("Yüklendi")
        }


        else -> {
            statusImageView.visibility = View.VISIBLE
            println("Hata Verdi")
        }
    }

}

@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView, imageUrl: String?) {
    imageUrl?.let {
        Glide.with(imageView.context).load(imageUrl).apply(
            RequestOptions().placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_background)
        ).into(imageView)


    }
}