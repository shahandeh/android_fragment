package com.example.fragmenttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            add<Head>(R.id.head)
            add<Body>(R.id.body)
            add<Foot>(R.id.foot)
            setReorderingAllowed(true)
        }
    }
}