package com.example.decimo_1.model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DecimoViewModel: ViewModel()
{
    private val _counter = mutableStateOf(0)
    val counter:State<Int> = _counter
    private val _nObjects = mutableStateOf(0)
    val nObjects:State<Int> = _nObjects
    private val _descuento = mutableStateOf(0)
    val descuento:State<Int> = _descuento



    private val _text= mutableStateOf("")
    val text:State<String> = _text

    private val _text2= mutableStateOf("")
    val text2:State<String> = _text2

    private val _counter1= mutableStateOf(18)
    val counter1:State<Int> = _counter1

    private val _counter2= mutableStateOf(12)
    val counter2:State<Int> = _counter2

    private val _taco = mutableStateOf(0)
    val taco:State<Int> = _taco

    private val _tostadas = mutableStateOf(0)
    val tostadas:State<Int> = _tostadas

    private val _empanadas = mutableStateOf(0)
    val empanadas:State<Int> = _empanadas

    private val _sicronozada = mutableStateOf(0)
    val sicronozada:State<Int> = _sicronozada



    private val _contar = mutableStateOf(0)
    val contar:State<Int> = _contar



    fun Add()
    {
        _counter.value=_counter.value +1
    }
    fun Addq()
    {
        _counter.value=_counter.value +2
    }
    fun Addw()
    {
        _counter.value=_counter.value +5
    }
    fun Adde()
    {
        _counter.value=_counter.value -5
    }
    fun reset()
    {
        _counter.value = 0

    }
    fun hello(cadena:String)
    {
        _text.value = ""+cadena

    }
    fun letra(cadena:String)
    {
        _text2.value= ""+cadena
    }

    fun ftaco(){
        _taco.value = 12
    }
    fun ftos(){
        _tostadas.value = 15
    }
    fun femp(){
        _empanadas.value = 20
    }
    fun fsin(){
        _sicronozada.value = 18
    }
    fun sumaproducto(){
        _counter.value
    }
    fun setSum(value:Int){

        _result.value = _result.value + value
    }





}