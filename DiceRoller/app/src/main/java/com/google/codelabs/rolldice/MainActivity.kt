package com.google.codelabs.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.iv_dice1)
        diceImage2 = findViewById(R.id.iv_dice2)

        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener{ rollDice() }

        /*
        val countUpButton: Button = findViewById(R.id.btn_countup)
        countUpButton.setOnClickListener{ countUp() }
         */

    }

    private fun getRandomDiceImage() : Int {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    /*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.txt_dice)
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else if (resultText.text.toString().toInt() == 6){

        } else resultText.text = (resultText.text.toString().toInt() + 1).toString()
    }
     */

}