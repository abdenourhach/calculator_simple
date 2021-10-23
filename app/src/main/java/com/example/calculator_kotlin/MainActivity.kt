package com.example.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun buNumberEvent(view: View) {

        if(isnewOp){
            etshownumber.setText("")
                    }

        isnewOp=false;


        val etshoww = findViewById<EditText>(R.id.etshownumber);
        var buselected = view as Button
        var buclickvalue: String = etshownumber.text.toString()

        when (buselected.id) {

            bu0.id -> {
                buclickvalue += "0"
            }
            bu1.id -> {
                buclickvalue += "1"
            }
            bu2.id -> {
                buclickvalue += "2"
            }
            bu3.id -> {
                buclickvalue += "3"
            }
            bu4.id -> {
                buclickvalue += "4"
            }
            bu5.id -> {
                buclickvalue += "5"
            }
            bu6.id -> {
                buclickvalue += "6"
            }
            bu7.id -> {
                buclickvalue += "7"
            }
            bu8.id -> {
                buclickvalue += "8"
            }
            bu9.id -> {
                buclickvalue += "9"
            }

            budot.id -> {
                buclickvalue += "."

            }
            buplusminas.id -> {
                buclickvalue = "-" + buclickvalue
            }

            buselected.id -> {
                buclickvalue = "0"
            }


        }

        etshownumber.setText(buclickvalue)

    }









                var op="*"
                var oldumbre=""
                var isnewOp=true;




    fun buOPevent(view: View) {


        var buselected = view as Button


        when (buselected.id) {

            bumultible.id -> {
                op="*"

            }


            bu9isma.id -> {
                op="/"

            }


            busub.id -> {
                op="-"

            }


            buadd.id -> {
                op="+"

            }
        }


        oldumbre=etshownumber.text.toString()
       isnewOp=true

    }




    fun buOPEqwal(view: View){
               val newNumber=etshownumber.text.toString()
               var finalnumber:Double?=null
        when(op){
            "/"->{
                finalnumber=oldumbre.toDouble()/newNumber.toDouble();
                 }

            "*"->{

                 finalnumber=oldumbre.toDouble()*newNumber.toDouble();
                }
           "+"->{

                finalnumber=oldumbre.toDouble()+newNumber.toDouble();
               }


         "-"->{
               finalnumber=oldumbre.toDouble()-newNumber.toDouble();

             }

           }
               etshownumber.setText(finalnumber.toString())
              isnewOp=true

                            }




    fun buPercent(view: View){
        val number=etshownumber.text.toString().toDouble()/100

        etshownumber.setText(number.toString())
                             }


    fun buClean(view: View){
etshownumber.setText("0")
        isnewOp=true
                           }
}