package illia.herman.complexrecyclerview.adapter.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.model.Popularity

/**
 * Created by illia.herman on 07.10.2019
 */
class PopularityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val viewsLabel = itemView.findViewById<AppCompatTextView>(R.id.course_eye_button)
    private val likeLabel = itemView.findViewById<AppCompatTextView>(R.id.course_like_button)
    private val dislikeLabel = itemView.findViewById<AppCompatTextView>(R.id.course_dislike_button)

    fun populateData(popularity: Popularity) {
        viewsLabel.text = popularity.viewsCount.toString()
        likeLabel.text = popularity.likeCount.toString()
        dislikeLabel.text = popularity.dislikeCount.toString()
    }
}