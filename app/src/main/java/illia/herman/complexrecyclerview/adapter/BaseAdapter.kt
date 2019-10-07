package illia.herman.complexrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.adapter.viewholder.ContentViewHolder
import illia.herman.complexrecyclerview.adapter.viewholder.PopularityViewHolder
import illia.herman.complexrecyclerview.adapter.viewholder.RecyclerViewHolder
import illia.herman.complexrecyclerview.model.Article

/**
 * Created by illia.herman on 07.10.2019
 */
class BaseAdapter internal constructor(
    private val dataList: ArrayList<Article>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            CellType.CONTENT.ordinal -> ContentViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.viewholder_content, parent, false
                )
            )
            CellType.IMG.ordinal -> RecyclerViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.viewholder_recycler, parent, false
                )
            )
            CellType.POPULARITY.ordinal -> PopularityViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.viewholder_popularity, parent, false
                )
            )
            else -> ContentViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.viewholder_content, parent, false
                )
            )
        }
    }

    override fun getItemCount(): Int = dataList.size * 3

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val isContent = getItemViewType(position) == CellType.CONTENT.ordinal
        val isImg = getItemViewType(position) == CellType.IMG.ordinal
        val isPopularity = getItemViewType(position) == CellType.POPULARITY.ordinal

        val currentDataItem = dataList[position / 3]

        when {
            isContent -> (holder as ContentViewHolder).populateData(currentDataItem.content)
            isImg -> (holder as RecyclerViewHolder).initRecyclerView(
                imgAdapter = ImgAdapter(
                    currentDataItem.picUrl
                )
            )
            isPopularity -> (holder as PopularityViewHolder).populateData(currentDataItem.popularity)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            position % 3 == 0 -> CellType.CONTENT.ordinal
            (position - 1) % 3 == 0 -> CellType.IMG.ordinal
            else -> CellType.POPULARITY.ordinal
        }
    }

    /***
     * Enum class for recyclerview Cell type
     */
    enum class CellType(viewType: Int) {
        CONTENT(0),
        IMG(1),
        POPULARITY(2)
    }

}