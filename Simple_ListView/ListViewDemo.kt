package karun.com.googlemapdemo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.list_view.*

import java.util.ArrayList
import java.util.HashMap
import android.view.ViewGroup



class ListViewDemo : AppCompatActivity() {

   // https://www.materialui.co/unicode-characters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)


        val list= mutableListOf<String>("Mango","Lichi","Apple","Banana")
        val adp=object : ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list){
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val view=super.getView(position, convertView, parent)

                if(position%2==0){
                    view.setBackgroundColor(Color.BLUE)
                }else
                    view.setBackgroundColor(Color.DKGRAY)
                return view
            }

        }
           listview.adapter=adp

            listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(baseContext,listview.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show()
        }
    }

}