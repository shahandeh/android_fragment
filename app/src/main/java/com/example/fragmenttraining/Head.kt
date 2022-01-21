package com.example.fragmenttraining

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Head : Fragment(R.layout.activity_head) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val iv = view.findViewById<ImageView>(R.id.headView)
        val headList = mutableListOf(
            R.drawable.head1,
            R.drawable.head2,
            R.drawable.head3,
            R.drawable.head4,
            R.drawable.head5,
            R.drawable.head6,
            R.drawable.head7,
            R.drawable.head8,
            R.drawable.head9,
            R.drawable.head10,
            R.drawable.head11,
            R.drawable.head12
        )
        var number = 0
        iv.setImageResource(headList[number])

        iv.setOnClickListener {
            number += 1
            number %= 12
            iv.setImageResource(headList[number])
        }
    }

}