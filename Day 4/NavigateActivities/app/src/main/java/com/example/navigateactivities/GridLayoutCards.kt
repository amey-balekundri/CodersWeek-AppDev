package com.example.navigateactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigateactivities.adapters.AlphaAdapters
import com.example.navigateactivities.model.CharItem

class GridLayoutCards : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<CharItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gridlayoutcards)


        recyclerView = findViewById(R.id.recyclerview)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<CharItem> {

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.download_1, "wall 1"))
        arrayList.add(CharItem(R.drawable.download_2, "wall 2"))
        arrayList.add(CharItem(R.drawable.download_3, "wall 3"))
        arrayList.add(CharItem(R.drawable.download_4, "wall 4"))
        arrayList.add(CharItem(R.drawable.download_5, "wall 5"))
        arrayList.add(CharItem(R.drawable.download_6, "wall 6"))
        arrayList.add(CharItem(R.drawable.download_7, "wall 7"))
        arrayList.add(CharItem(R.drawable.download_8, "wall 8"))
        arrayList.add(CharItem(R.drawable.download_1, "wall 9"))
        arrayList.add(CharItem(R.drawable.download_2, "wall 10"))
        arrayList.add(CharItem(R.drawable.download_3, "wall 11"))
        arrayList.add(CharItem(R.drawable.download_4, "wall 12"))
        arrayList.add(CharItem(R.drawable.download_5, "wall 13"))
        arrayList.add(CharItem(R.drawable.download_6, "wall 14"))
        arrayList.add(CharItem(R.drawable.download_7, "wall 15"))
        arrayList.add(CharItem(R.drawable.download_8, "wall 16"))
        arrayList.add(CharItem(R.drawable.download_1, "wall 17"))
        arrayList.add(CharItem(R.drawable.download_2, "wall 18"))
        arrayList.add(CharItem(R.drawable.download_3, "wall 19"))
        arrayList.add(CharItem(R.drawable.download_4, "wall 20"))
        arrayList.add(CharItem(R.drawable.download_5, "wall 21"))
        arrayList.add(CharItem(R.drawable.download_7, "wall 22"))
        arrayList.add(CharItem(R.drawable.download_8, "wall 23"))
        arrayList.add(CharItem(R.drawable.download_1, "wall 24"))
        return arrayList



    }
}