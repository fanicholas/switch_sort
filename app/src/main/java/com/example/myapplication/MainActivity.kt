package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = ArrayList<Int>();
         /* val losowe = List(9) { Random.nextInt(0, 100) } */

        val s1 = findViewById<Switch>(R.id.switch1)
        val s2 = findViewById<Switch>(R.id.switch2)
        val s3 = findViewById<Switch>(R.id.switch3)
        val s4 = findViewById<Switch>(R.id.switch4)
        val s5 = findViewById<Switch>(R.id.switch5)
        val s6 = findViewById<Switch>(R.id.switch6)
        val s7 = findViewById<Switch>(R.id.switch7)
        val s8 = findViewById<Switch>(R.id.switch8)
        val s9 = findViewById<Switch>(R.id.switch9)
        setContentView(R.layout.activity_main)
        for(i in 0..8){
            list.add(Random.nextInt(0,100))
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            s1.text = list[0].toString()
            s2.text = list[1].toString()
            s3.text = list[2].toString()
            s4.text = list[3].toString()
            s5.text = list[4].toString()
            s6.text = list[5].toString()
            s7.text = list[6].toString()
            s8.text = list[7].toString()
            s9.text = list[8].toString()


        }
    }






}