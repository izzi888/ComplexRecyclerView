package illia.herman.complexrecyclerview.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.adapter.ImgAdapter

/**
 * Created by illia.herman on 07.10.2019
 */
class RecyclerViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
    private val recyclerView = itemView.findViewById<RecyclerView>(R.id.base_recycler_view)

    fun initRecyclerView(
        isVertical: Boolean = false,
        imgAdapter: ImgAdapter? = null
    ) {
        recyclerView.setHasFixedSize(true)

        if (isVertical) {
            recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        } else recyclerView.layoutManager =
            LinearLayoutManager(recyclerView.context, LinearLayoutManager.HORIZONTAL, false)

        if (imgAdapter != null) {
            recyclerView.adapter = imgAdapter
        }
    }
}