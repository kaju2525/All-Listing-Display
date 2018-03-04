package karun.com.googlemapdemo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast

import kotlinx.android.synthetic.main.spinner.*

import android.view.ViewGroup
import android.widget.AdapterView


class ListViewDemo : AppCompatActivity() {

   // https://www.materialui.co/unicode-characters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spinner)


        val list= mutableListOf<String>("Mango","Lichi","Apple","Banana")
        val adp= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        adp.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        sp.adapter=adp

        sp.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(baseContext,sp.getItemAtPosition(p2).toString(),Toast.LENGTH_SHORT).show()
            }

        }

    }

}