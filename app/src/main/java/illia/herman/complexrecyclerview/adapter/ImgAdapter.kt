package illia.herman.complexrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import illia.herman.complexrecyclerview.R
import illia.herman.complexrecyclerview.adapter.viewholder.ImgViewHolder

/**
 * Created by illia.herman on 07.10.2019
 */
class ImgAdapter internal constructor(
    private val dataList: List<String>
) : RecyclerView.Adapter<ImgViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgViewHolder {
        return ImgViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.viewholder_img, parent, false)
        )
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ImgViewHolder, position: Int) {
        val currentDataItem = dataList[position]
        holder.setUrl(currentDataItem)
    }

}