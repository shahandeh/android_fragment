package com.example.fragmenttraining

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Foot : Fragment(R.layout.activity_foot) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val iv = view.findViewById<ImageView>(R.id.legView)
        val legList = mutableListOf(
            R.drawable.legs1,
            R.drawable.legs2,
            R.drawable.legs3,
            R.drawable.legs4,
            R.drawable.legs5,
            R.drawable.legs6,
            R.drawable.legs7,
            R.drawable.legs8,
            R.drawable.legs9,
            R.drawable.legs10,
            R.drawable.legs11,
            R.drawable.legs12
        )
        var number = 0
        iv.setImageResource(legList[number])

        iv.setOnClickListener {
            number += 1
            number %= 12
            iv.setImageResource(legList[number])
        }
    }
}