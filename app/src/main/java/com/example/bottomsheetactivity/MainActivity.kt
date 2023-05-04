package com.example.bottomsheetactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerAdapter
    private lateinit var list: MutableList<String>

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.shareRecycler)
        list = mutableListOf()
        addData()
        adapter = RecyclerAdapter(list)
        recyclerView.adapter = adapter
        var bottomSheet = findViewById<ConstraintLayout>(R.id.linearLayout12)
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

//        bottomSheetBehavior.addBottomSheetCallback(object :
//            BottomSheetBehavior.BottomSheetCallback() {
//
//            override fun onSlide(bottomSheet: View, slideOffset: Float) {
//                // handle onSlide
//            }
//
//            override fun onStateChanged(bottomSheet: View, newState: Int) {
//                when (newState) {
//                    BottomSheetBehavior.STATE_COLLAPSED -> Toast.makeText(this@MainActivity, "STATE_COLLAPSED", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_EXPANDED -> Toast.makeText(this@MainActivity, "STATE_EXPANDED", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_DRAGGING -> Toast.makeText(this@MainActivity, "STATE_DRAGGING", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_SETTLING -> Toast.makeText(this@MainActivity, "STATE_SETTLING", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_HIDDEN -> Toast.makeText(this@MainActivity, "STATE_HIDDEN", Toast.LENGTH_SHORT).show()
//                    else -> Toast.makeText(this@MainActivity, "OTHER_STATE", Toast.LENGTH_SHORT).show()
//                }
//            }
//        })
        var btnBottomSheetPersistent = findViewById<Button>(R.id.btnBottomSheetPersistent)
        btnBottomSheetPersistent.setOnClickListener {
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED)
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            else
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

    }
    fun addData(){
        var text1:String = "satwinder"
        var text2:String = "shergill"
        for (i in 1..20)
            list.add(text1)
            list.add(text2)
    }
}

private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>


