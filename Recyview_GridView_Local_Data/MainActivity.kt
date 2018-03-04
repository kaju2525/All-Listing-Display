package karun.com.googlemapdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {

   // compile'com.android.support:recyclerview-v7:26.1.0'

    lateinit var list: ArrayList<Model>
    lateinit var adp: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //recyclearView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
       recyclearView.layoutManager= GridLayoutManager(this,2)


        list = ArrayList<Model>()
        list.add(Model("Neha", R.drawable.pin))
        list.add(Model("Karun", R.drawable.pin))
        list.add(Model("Umesh", R.drawable.pin))
        list.add(Model("Kaju", R.drawable.pin))


        adp= MyAdapter(applicationContext,list)
        recyclearView.adapter=adp

    }

}