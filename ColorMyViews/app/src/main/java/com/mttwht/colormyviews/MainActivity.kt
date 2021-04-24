package com.mttwht.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            rootConstraintLayout
        )

        for(view in clickableViews)
            view.setOnClickListener { makeColoured(it) }
    }

    private fun makeColoured(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)
            else -> view.setBackgroundColor(Color.BLACK)
        }
    }
}