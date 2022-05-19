package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnadd:Button
    lateinit var btnsub:Button
    lateinit var btnmulti:Button
    lateinit var btnmodules:Button
    lateinit var etdigit1:EditText
    lateinit var etdigit2:EditText
    lateinit var tvresult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnadd=findViewById(R.id.btnadd)
        btnsub=findViewById(R.id.btnsub)
        btnmulti=findViewById(R.id.btnmult)
        btnmodules=findViewById(R.id.btnmodules)
        etdigit1=findViewById(R.id.etdigit1)
        etdigit2=findViewById(R.id.etdigit2)
        tvresult=findViewById(R.id.tvresult)

            btnadd.setOnClickListener{
                var sumup=etdigit1.text.toString().toInt()
                var doadd=etdigit2.text.toString().toInt()
                addtion(sumup,doadd)

        }
        btnsub.setOnClickListener{
            var sumup=etdigit1.text.toString().toInt()
            var doadd=etdigit2.text.toString().toInt()
            subtraction(sumup,doadd)
        }
        btnmulti.setOnClickListener{
            var sumup=etdigit1.text.toString().toInt()
            var doadd=etdigit2.text.toString().toInt()
            multiplication(sumup,doadd)
        }
        btnmodules.setOnClickListener{
            var sumup=etdigit1.text.toString().toInt()
            var doadd=etdigit2.text.toString().toInt()
            modules(sumup,doadd)
        }

    }
    fun addtion(num1:Int, num2:Int){
        var sum=num1+num2
        tvresult.text=sum.toString()
    }
    fun subtraction(num1:Int, num2:Int){
        var minus=num1-num2
        tvresult.text=minus.toString()
    }
    fun multiplication(num1:Int, num2:Int){
        var multiply=num1*num2
        tvresult.text=multiply.toString()
    }
    fun modules(num1:Int, num2:Int){
        var mod=num1%num2
        tvresult.text=mod.toString()
    }
}
