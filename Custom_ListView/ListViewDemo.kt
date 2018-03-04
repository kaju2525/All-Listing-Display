package karun.com.googlemapdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.list_view.*


class ListViewDemo : AppCompatActivity() {

    lateinit var list: ArrayList<Model>
    lateinit var adp: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)


        list = ArrayList<Model>()
        list.add(Model("Neha", R.drawable.pin))
        list.add(Model("Karun", R.drawable.pin))
        list.add(Model("Umesh", R.drawable.pin))
        list.add(Model("Kaju", R.drawable.pin))


        adp= MyAdapter(applicationContext,list)
        listview.adapter=adp

    }

}