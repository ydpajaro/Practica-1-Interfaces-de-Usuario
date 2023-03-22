package com.yeinerdpajaro.finalgradecalculatorapp.ui.gradecalculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GradeCalculatorViewModel : ViewModel() {

    val mensaje: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    //companion object {

    fun encontrarerrores(noteOne: String, noteTwo: String, noteThree: String, noteFour: String) {
        if (noteOne == "." || noteOne == "" || noteTwo == "." || noteTwo == "" || noteThree == "." || noteThree == "" || noteFour == "." || noteFour == "") {
            mensaje.value = "Error. No se puede poner '.' ni dejar espacios vacíos en ningún valor."
        }
        else {
            this.calcular(noteOne.toFloat(), noteTwo.toFloat(), noteThree.toFloat(), noteFour.toFloat())
        }
    }

    fun calcular(noteOne: Float, noteTwo: Float, noteThree: Float, noteFour: Float) {

        if (noteOne >= 0.0 && noteOne <= 5.0 && noteTwo >= 0.0 && noteTwo <= 5.0 && noteThree >= 0.0 && noteThree <= 5.0 && noteFour >= 0.0 && noteFour <= 5.0) {

            val resultado =
                (noteOne * 0.6 + noteTwo * 0.07 + noteThree * 0.08 + noteFour * 0.25).toFloat()
            mensaje.value = "Su nota final es: $resultado"
        }
        else mensaje.value = "Error. Debe ingresar valores entre cero y cinco."
    }

}