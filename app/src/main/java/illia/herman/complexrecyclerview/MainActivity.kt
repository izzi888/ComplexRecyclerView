package illia.herman.complexrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import illia.herman.complexrecyclerview.adapter.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        base_recycler_view.setHasFixedSize(true)
        base_recycler_view.layoutManager = LinearLayoutManager(this)
        base_recycler_view.adapter = BaseAdapter(dataList = Data.articles)
    }
}
