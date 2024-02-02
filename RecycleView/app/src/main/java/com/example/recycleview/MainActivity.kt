package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.MyAdapter
import com.example.recycleview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup what this looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        //all about data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }
    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable._17306272_10223686822221268_1443996898237558673_n, "Me and Girls in MI"))
        items.add(MyModel(R.drawable._17563917_10226383367873224_5501184033371077504_n, "Dottie"))
        items.add(MyModel(R.drawable._20068710_10223998224206123_8998067855963219286_n, "Me and Girls at Starved Rock"))
        items.add(MyModel(R.drawable._19945692_10223974956504445_8246022934482199083_n, "Cousins"))
        items.add(MyModel(R.drawable._40733079_10226599629159621_4182669901342795897_n, "Me and Katie in Mexico"))
        items.add(MyModel(R.drawable._48482883_10225224250416012_5230938559976014653_n, "Me and Kels in MI"))
        items.add(MyModel(R.drawable._58130657_10230919348429903_4159123372493971282_n, "Me and Taylor"))
        items.add(MyModel(R.drawable._58136343_10230919347989892_8850639664359711207_n, "Me and Katie Kayaking"))
        items.add(MyModel(R.drawable._58138618_10230919346149846_2055729762036766033_n, "The OG MI Picture from the 90's"))
        items.add(MyModel(R.drawable._58140693_10230919347829888_6177607475864754885_n, "Riv and Lip"))
        items.add(MyModel(R.drawable._58155002_10230919345229823_6581095523520252027_n, "My favorite Gals"))
        items.add(MyModel(R.drawable._58155261_10230919346389852_4709509342012839199_n, "Riv being so cool"))
        items.add(MyModel(R.drawable._59382195_10225409014915009_5852744122305151597_n, "Me and Riv on the slide"))
        items.add(MyModel(R.drawable._72378234_10227455200388367_7087948821709322250_n, "Me and Katie at the Bears Game"))
        items.add(MyModel(R.drawable._74740123_10227640173732585_2520386101942154731_n, "The beautiful Mountains in WA"))
        items.add(MyModel(R.drawable._74817234_10227640173772586_6588310917749307815_n, "Ellie in WA"))
        items.add(MyModel(R.drawable._74820849_10227640150612007_7251902719903179738_n, "Dottie, Ellie and Lip in WA"))
        items.add(MyModel(R.drawable._77540090_10225798958103345_2679581525694597203_n, "Me and the girls at the Mississippi Palisades"))
        items.add(MyModel(R.drawable._80750488_10228057475844877_7471415901676408409_n, "Ellie, Dottie and Lip in OR"))
        items.add(MyModel(R.drawable._84956116_10225906598914298_1553723042118248767_n, "Me and my Mom"))
        items.add(MyModel(R.drawable._88613303_10226005027654955_3696357300893860744_n, "Me and Katie in MI"))
        items.add(MyModel(R.drawable._89031627_10224606919495332_7777286304697287722_n, "Me and Katie going to the Pride Parade in Chicago"))
        items.add(MyModel(R.drawable._90180140_10226005864435874_7992149188880305482_n, "Ellie and Dottie at the beach"))
        items.add(MyModel(R.drawable._98680606_10231755061842216_5088858791221223285_n, "Me and Katie on our Wedding Day"))
        items.add(MyModel(R.drawable._58138153_10230919345549831_419766040893355919_n, "Me and Alicia"))

        return items
    }

}