package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = "0"
        var temp1 = 0
        var temp2 = 0
        var text = ""
        var pos = 0 // +:1, -:2, *:3, /:4

        n1.setOnClickListener{
            if (a == "0")
                a = "1"
            else
                a = a + "1"

            text = "$text" + "1"
            result.text = text
        }

        n2.setOnClickListener{
            if (a == "0")
                a = "2"
            else
                a = a + "2"

            text = "$text" + "2"
            result.text = text
        }

        n3.setOnClickListener{
            if (a == "0")
                a = "3"
            else
                a = a + "3"

            text = "$text" + "3"
            result.text = text
        }

        n4.setOnClickListener{
            if (a == "0")
                a = "4"
            else
                a = a + "4"

            text = "$text" + "4"
            result.text = text
        }

        n5.setOnClickListener{
            if (a == "0")
                a = "5"
            else
                a = a + "5"

            text = "$text" + "5"
            result.text = text
        }

        n6.setOnClickListener{
            if (a == "0")
                a = "6"
            else
                a = a + "6"

            text = "$text" + "6"
            result.text = text
        }

        n7.setOnClickListener{
            if (a == "0")
                a = "7"
            else
                a = a + "7"

            text = "$text" + "7"
            result.text = text
        }

        n8.setOnClickListener{
            if (a == "0")
                a = "8"
            else
                a = a + "8"

            text = "$text" + "8"
            result.text = text
        }

        n9.setOnClickListener{
            if (a == "0")
                a = "9"
            else
                a = a + "9"

            text = "$text" + "9"
            result.text = text
        }

        n0.setOnClickListener{
            if (a == "0")

            else{
                a = a + "0"
                text = "$text" + "0"
                result.text = text
            }
        }


        add.setOnClickListener{
            temp1 = a.toInt()
            text = "$a + "
            a = "0"
            result.text = text
            pos = 1
        }

        sub.setOnClickListener{
            temp1 = a.toInt()
            text = "$a - "
            a = "0"
            result.text = text
            pos = 2
        }

        mult.setOnClickListener{
            temp1 = a.toInt()
            text = "$a x "
            a = "0"
            result.text = text
            pos = 3
        }

        div.setOnClickListener{
            temp1 = a.toInt()
            text = "$a / "
            a = "0"
            result.text = text
            pos = 4
        }

        calc.setOnClickListener{
            temp2 = a.toInt()
            text = cal(temp1, temp2, pos).toString()
            result.text=text
            pos = 0
            a = "0"
            text = ""
        }
    }

    fun cal(a: Int, b: Int, pos: Int): Int{
        when (pos) {
            1 -> return a+b
            2 -> return a-b
            3 -> return a*b
            4 -> return a/b
            else -> return 0
        }
    }
}