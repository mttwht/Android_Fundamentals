package com.mttwht.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val blueButton = findViewById<Button>(R.id.blue_button)

        val clickableViews: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
            rootConstraintLayout,
            redButton, greenButton, blueButton
        )

        for(view in clickableViews)
            view.setOnClickListener { makeColoured(it) }
    }

    private fun makeColoured(view: View) {
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)

            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.green_button -> boxFourText.setBackgroundResource(R.color.my_green)
            R.id.blue_button -> boxFiveText.setBackgroundResource(R.color.my_blue)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}