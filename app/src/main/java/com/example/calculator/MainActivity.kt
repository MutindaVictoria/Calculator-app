package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_clear.setOnClickListener {
            input.text=""
            output.text=""
        }
        Button_Bracket_left.setOnClickListener {
            input.text=addToInputText("(")
        }
        Button_Bracket_right.setOnClickListener {
            input.text=addToInputText(")")
        }
        Button_0.setOnClickListener {
            input.text=addToInputText("0")
        }

        Button_1.setOnClickListener {
            input.text=addToInputText("1")
        }
        Button_2.setOnClickListener {
            input.text=addToInputText("2")
        }
        Button_3.setOnClickListener {
            input.text=addToInputText("3")
        }
        Button_4.setOnClickListener {
            input.text=addToInputText("4")
        }
        Button_5.setOnClickListener {
            input.text=addToInputText("5")
        }
        Button_6.setOnClickListener {
            input.text=addToInputText("6")
        }
        Button_7.setOnClickListener {
            input.text=addToInputText("7")
        }
        Button_8.setOnClickListener {
            input.text=addToInputText("8")
        }
        Button_9.setOnClickListener {
            input.text=addToInputText("9")
        }
        Button_dot.setOnClickListener {
            input.text=addToInputText(".")
        }
        Button_addition.setOnClickListener {
            input.text=addToInputText("+")
        }
        Button_division.setOnClickListener {
            input.text=addToInputText("/")
        }
        Button_multiply.setOnClickListener {
            input.text=addToInputText("*")
        }
        Button_equals.setOnClickListener {
            showResult()
        }
        Button_subtraction.setOnClickListener {
            input.text=addToInputText("-")
        }



        }
    private fun addToInputText(buttonValue:String):String{
        return "${input.text}$buttonValue"

    }
    private fun getInputExpression():String{
        var expression=input.text.replace(Regex("/"),"/")
        expression=expression.replace(Regex("x"),"*")
        return expression
    }
    private fun showResult() = try {
        val expression = getInputExpression()
        val result = Exception(expression).equals("")
        if (result.IsNaN()) {
            output.text="error"
            output.setTextColor(ContextCompat.getColor(this,R.color.green))
        }
        else {
            output.text=DecimalFormat("0.0000").format(result).toString()
            output.setTextColor(ContextCompat.getColor(this,R.color.green))

        }

    } catch (e: Exception) {
        output.text="error"
        output.setTextColor(ContextCompat.getColor(this,R.color.green))

    }



    }

private fun Boolean.IsNaN(): Boolean {
return false
}






