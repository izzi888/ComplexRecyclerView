package illia.herman.complexrecyclerview.adapter.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.model.Content

/**
 * Created by illia.herman on 07.10.2019
 */
class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val header = itemView.findViewById<AppCompatTextView>(R.id.tv_header)
    private val content = itemView.findViewById<AppCompatTextView>(R.id.tv_content)

    fun populateData(info: Content) {
        header.text = info.header
        content.text = info.description
    }
}