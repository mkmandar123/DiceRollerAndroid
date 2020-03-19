package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var randInt:Int= Random.nextInt(6)+1
        button.setOnClickListener{
            randInt= Random.nextInt(6)+1
            when(randInt){
                1-> imageView.setImageResource(R.drawable.dice_1)
                2-> imageView.setImageResource(R.drawable.dice_2)
                3-> imageView.setImageResource(R.drawable.dice_3)
                4-> imageView.setImageResource(R.drawable.dice_4)
                5-> imageView.setImageResource(R.drawable.dice_5)
                6-> imageView.setImageResource(R.drawable.dice_6)
            }

        }
        button2.setOnClickListener{
            val guess=input.text.toString()
            if(randInt.toString()==guess)
            {
                result_text.text="Winner Winner Chicken Dinner"
            }
            else
            {
                result_text.text="Consider Yourself dumbest person alive"
            }
        }

    }

}
