package karun.com.googlemapdemo

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter(private val context: Context, private val list: ArrayList<Model>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyAdapter.ViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.row_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: MyAdapter.ViewHolder?, position: Int) {

        holder!!.bindItem(list[position],position+1)

        if(position%2==0){
            holder.itemView.setBackgroundColor(Color.GRAY)
        }
        else
            holder.itemView.setBackgroundColor(Color.LTGRAY)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(model:Model,p:Int){

            itemView.img.setImageResource(model.avatar)
            itemView.tv.text=model.name
            itemView.ids.text=""+p

        }
    }
}

