package com.example.fragmenttraining

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Body : Fragment(R.layout.activity_body) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val iv = view.findViewById<ImageView>(R.id.bodyView)
        val bodyList = mutableListOf(
            R.drawable.body1,
            R.drawable.body2,
            R.drawable.body3,
            R.drawable.body4,
            R.drawable.body5,
            R.drawable.body6,
            R.drawable.body7,
            R.drawable.body8,
            R.drawable.body9,
            R.drawable.body10,
            R.drawable.body11,
            R.drawable.body12
        )
        var number = 0
        iv.setImageResource(bodyList[number])

        iv.setOnClickListener {
            number += 1
            number %= 12
            iv.setImageResource(bodyList[number])
        }
    }
}