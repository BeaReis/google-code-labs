package com.google.codelabs.colormyviews

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.codelabs.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun makeColored(view: View) {

        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.boxFiveText.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }

        /*
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.ic_android)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.ic_beach)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.ic_cloud)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.ic_cloud)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.ic_cloud)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
        */
    }

    private fun setListeners() {

        val clickableViews: List<View> =
            listOf(
                binding.boxOneText,
                binding.boxTwoText,
                binding.boxThreeText,
                binding.boxFourText,
                binding.boxFiveText,
                binding.constraintLayout,
                binding.redButton,
                binding.greenButton,
                binding.yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
