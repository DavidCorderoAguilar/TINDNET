package com.example.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.androidmaster.R

class imcCalcuatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = true
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calcuator)
        initComponent()
        initListener()
        initUI()
    }

    private fun initComponent(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }
    private fun initListener(){
        viewMale.setOnClickListener{
            setGenderColor()
            changeGender()
        }
        viewFemale.setOnClickListener{
            setGenderColor()
            changeGender()
        }
    }
    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }
    private fun setGenderColor(){

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }
    private fun getBackgroundColor(isSelectedComponent:Boolean):Int{

        val colorReference = if(isSelectedComponent){
            R.color.Background_component_selected
        }else{
            R.color.Background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }
    private fun initUI() {
        setGenderColor()
    }
}