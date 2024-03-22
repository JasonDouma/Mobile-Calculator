package com.example.calculator_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        fun addingtwonumbers() {
            /*
                Variables.
             */

            var num1 = findViewById<EditText>(R.id.number1)
            var num2 = findViewById<EditText>(R.id.number2)
            var button1 = findViewById<Button>(R.id.addbutton)
            var clearButton = findViewById<Button>(R.id.clearbutton)
            var multiplybutton = findViewById<Button>(R.id.multiplybutton)
            var dividebutton = findViewById<Button>(R.id.divisionbutton)

            /*
                Click Event To Add And Display Result.
             */

            button1.setOnClickListener {

                var addnum1 = num1.text.toString().toInt()
                var addnum2 = num2.text.toString().toInt()
                var result = addnum1 + addnum2

                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
            }

            /*
                Event To Clear Text On Screen.
             */

            clearButton.setOnClickListener {

                Toast.makeText(this, "Succesfully Cleared!", Toast.LENGTH_SHORT).show()

                num1.setText("");
                num2.setText("");

            }

            /*
                Event To Perform Multiplication And Display Result.
             */

            multiplybutton.setOnClickListener {

                var num1 = num1.text.toString().toInt()
                var num2 = num2.text.toString().toInt()
                var result = num1 * num2

                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()

            }

            /*
                Event To Do Division And Display Result.
             */

            dividebutton.setOnClickListener {

                var num1 = num1.text.toString().toInt()
                var num2 = num2.text.toString().toInt()
                var result = num1 / num2

                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()

            }

        }
        addingtwonumbers()
    }
}