package com.example.fourth_travels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var curr=0
    lateinit var image : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        next.setOnClickListener {
            // Next image
            try {
                var current = "a$curr"
                var idofnew = resources.getIdentifier(current, "id", packageName)
                val currentImageView = findViewById<ImageView>(idofnew)
                currentImageView.alpha = 0f

                curr=(curr+1)%3

                var current1 = "a$curr"
                var idofnew1 = resources.getIdentifier(current1, "id", packageName)
                val nextImageView = findViewById<ImageView>(idofnew1)
                nextImageView.alpha = 1f
            } catch (e: Exception) {

            }
        }

        prev.setOnClickListener {
            // Prev image

            var current = "a$curr"
            var idofnew = resources.getIdentifier(current, "id", packageName)
            val currentImageView = findViewById<ImageView>(idofnew)
            currentImageView.alpha = 0f
            if (curr==0){
                curr+=3
            }
            curr=(curr-1)%3

            var current1 = "a$curr"
            var idofnew1 = resources.getIdentifier(current1, "id", packageName)
            val nextImageView = findViewById<ImageView>(idofnew1)
            nextImageView.alpha = 1f
        }
    }
}