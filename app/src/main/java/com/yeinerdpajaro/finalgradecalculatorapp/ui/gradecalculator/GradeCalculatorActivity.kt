package com.yeinerdpajaro.finalgradecalculatorapp.ui.gradecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yeinerdpajaro.finalgradecalculatorapp.R
import com.yeinerdpajaro.finalgradecalculatorapp.databinding.ActivityGradeCalculatorBinding

class GradeCalculatorActivity : AppCompatActivity() {

    private lateinit var GradeCalculatorBinding: ActivityGradeCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GradeCalculatorBinding = ActivityGradeCalculatorBinding.inflate(layoutInflater)
        var view = GradeCalculatorBinding.root
        setContentView(view)
        GradeCalculatorBinding.calculateActionButton.setOnClickListener{
            val noteOne = GradeCalculatorBinding.noteOneEditText.text.toString().toDouble()
            val noteTwo = GradeCalculatorBinding.noteTwoEditText.text.toString().toDouble()
            val noteThree = GradeCalculatorBinding.noteTrheeEditText.text.toString().toDouble()
            val noteFour = GradeCalculatorBinding.noteFourEditText.text.toString().toDouble()



            if(noteOne >= 0.0 && noteOne <= 5.0 && noteTwo >= 0.0 && noteTwo <= 5.0 && noteThree >= 0.0 &&  noteThree <= 5.0 && noteFour >= 0.0 &&  noteFour <= 5.0 ){

                var resultado = noteOne*0.6 + noteTwo*0.07 + noteThree*0.08 + noteFour*0.25
                GradeCalculatorBinding.resultTextView.setText("Su nota final es: $resultado")
                GradeCalculatorBinding.noteOneEditText.setText("")
                GradeCalculatorBinding.noteTwoEditText.setText("")
                GradeCalculatorBinding.noteTrheeEditText.setText("")
                GradeCalculatorBinding.noteFourEditText.setText("")

            }


            else {

                GradeCalculatorBinding.resultTextView.text="Error. Debe ingresar valores entre cero y cinco"
            }



        }

    }
}