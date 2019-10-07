package illia.herman.complexrecyclerview.adapter.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.loadImage

/**
 * Created by illia.herman on 07.10.2019
 */
class ImgViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val img = itemView.findViewById<AppCompatImageView>(R.id.iv_placeholder)

    fun setUrl(url: String) {
        img.loadImage(url)
    }
}