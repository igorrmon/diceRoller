package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun shortDice(): Int {
        return Dice(6).roll()
    }

    private fun rollDice() {
        val resultTextView: TextView = findViewById(R.id.textView)
        val resultTextViewTwo: TextView = findViewById(R.id.textView2)
        resultTextView.text = shortDice().toString()
        resultTextViewTwo.text = shortDice().toString()
    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..this.numSides).random()
    }
}
