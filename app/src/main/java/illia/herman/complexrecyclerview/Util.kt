package illia.herman.complexrecyclerview

import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso

/**
 * Created by illia.herman on 07.10.2019
 */
fun AppCompatImageView.loadImage(url: String) {
    Picasso.get()
        .load(url)
        .fit()
        .centerCrop()
        .placeholder(R.drawable.placeholder)
        .into(this)
}