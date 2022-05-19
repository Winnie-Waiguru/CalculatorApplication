package com.example.caculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etFirstNum:EditText
    lateinit var  etSecondNum:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etFirstNum=findViewById(R.id.etFirstNum)
        etSecondNum=findViewById(R.id.etSecondNum)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1=etFirstNum.text.toString()
            val num2=etSecondNum.text.toString()
            if (num1.isBlank()){
                etFirstNum.error="Input required"
                return@setOnClickListener
            }

            if(num2.isBlank()){
                etSecondNum.error="Input required"
                return@setOnClickListener
            }
            addition(num1.toDouble(),num2.toDouble())
        }

        btnSubtract.setOnClickListener {
            val num1 = etFirstNum.text.toString()
            val num2=etSecondNum.text.toString()

            if (num1.isBlank()){
                etFirstNum.error="Input field"
            }
            if(num2.isBlank()){
                etSecondNum.error="Input field"
            }
            subtraction(num1.toDouble(),num2.toDouble())
        }

        btnMultiply.setOnClickListener {
            val num1=etFirstNum.text.toString()
            val  num2=etSecondNum.text.toString()

            if(num1.isBlank()){
                etFirstNum.error="input field"
            }
            if (num2.isBlank()){
                etSecondNum.error="input field"
            }
            multiplication(num1.toDouble(),num2.toDouble())
        }

        btnModulus.setOnClickListener {
            val num1=etFirstNum.text.toString()
            val num2=etSecondNum.text.toString()

            if(num1.isBlank()){
                etFirstNum.error="input field"
            }
            if(num2.isBlank()){
                etSecondNum.error="input field required"
            }
            mod(num1.toDouble(),num2.toDouble())
        }



    }

    fun addition(num1:Double, num2:Double){
        val add= num1+num2
        tvResult.text=add.toString()
    }

    fun subtraction(num1: Double,num2: Double){
        val subtract= num1-num2
        tvResult.text=subtract.toString()
    }

    fun multiplication(num1: Double,num2: Double){
        val multiply= num1*num2
        tvResult.text=multiply.toString()
    }

    fun mod(num1: Double,num2: Double){
        val modulus= num1%num2
        tvResult.text=modulus.toString()
    }

}