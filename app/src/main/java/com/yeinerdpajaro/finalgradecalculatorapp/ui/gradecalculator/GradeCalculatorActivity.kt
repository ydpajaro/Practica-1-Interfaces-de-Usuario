package com.yeinerdpajaro.finalgradecalculatorapp.ui.gradecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.yeinerdpajaro.finalgradecalculatorapp.R
import com.yeinerdpajaro.finalgradecalculatorapp.databinding.ActivityGradeCalculatorBinding


//CALCULADORA VIEWMODEL BUENA
class GradeCalculatorActivity : AppCompatActivity() {

    private lateinit var GradeCalculatorBinding: ActivityGradeCalculatorBinding
    private lateinit var gradeCalculatorViewModel: GradeCalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GradeCalculatorBinding = ActivityGradeCalculatorBinding.inflate(layoutInflater)

        gradeCalculatorViewModel = ViewModelProvider(this)[GradeCalculatorViewModel::class.java]

        var view = GradeCalculatorBinding.root
        setContentView(view)

        val mensajeObserver = Observer<String>{mensaje ->
            GradeCalculatorBinding.resultTextView.text=mensaje
        }

        gradeCalculatorViewModel.mensaje.observe(this, mensajeObserver)


        GradeCalculatorBinding.calculateActionButton.setOnClickListener{

            val noteOne = GradeCalculatorBinding.noteOneEditText.text.toString()
            val noteTwo = GradeCalculatorBinding.noteTwoEditText.text.toString()
            val noteThree = GradeCalculatorBinding.noteTrheeEditText.text.toString()
            val noteFour = GradeCalculatorBinding.noteFourEditText.text.toString()

            gradeCalculatorViewModel.encontrarerrores(noteOne, noteTwo, noteThree, noteFour)

        }

    }
}