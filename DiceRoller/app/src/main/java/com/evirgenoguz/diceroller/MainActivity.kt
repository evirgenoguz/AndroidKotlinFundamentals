package com.evirgenoguz.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        var countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }

        var resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetRoll() }

    }

    private fun resetRoll() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

    private fun countUp() {
        Toast.makeText(this, "countUp button clicked", Toast.LENGTH_LONG).show()

        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {

            resultText.text = "1"

        } else {

            var currentNumber = resultText.text.toString().toInt()

            if (currentNumber < 6) {

                currentNumber++
                resultText.text = currentNumber.toString()

            }
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resetButton: Button = findViewById(R.id.reset_button)

        resultText.text = randomInt.toString()
        resetButton.visibility = View.VISIBLE
    }

}

