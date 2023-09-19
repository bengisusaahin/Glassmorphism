package com.betrbeta.priorityupdates

//import GlassmorphicDrawable
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.glassmorphism.R

class GlassmorphicCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.glassmorphic_card)

        // Access the card's views and customize them
        val cardTitle = findViewById<TextView>(R.id.cardTitle)
        cardTitle.text = "Custom Card Title"

        // Add more customization and functionality as needed
//        val cardContainer = findViewById<FrameLayout>(R.id.glassmorphicCardContainer)
//        cardContainer.background = GlassmorphicDrawable()

    }
}