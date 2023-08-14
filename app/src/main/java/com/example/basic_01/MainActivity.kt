package com.example.basic_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

      lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            diceRoll()
        }
        diceImage = findViewById(R.id.image_View)
    }

    private fun diceRoll() {

        val randomView =Random().nextInt(6)+1
        val drawableResource  = when(randomView){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {
                 R.drawable.dice_6
            }
        }

        diceImage.setImageResource(drawableResource)

    }
}