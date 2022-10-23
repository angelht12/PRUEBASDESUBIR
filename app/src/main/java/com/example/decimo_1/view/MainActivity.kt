package com.example.decimo_1.view

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.decimo_1.model.DecimoViewModel
import com.example.decimo_1.ui.theme.Decimo_1Theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.decimo_1.R

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val objeto_view_Model: DecimoViewModel by viewModels()

        setContent {
            Column(Modifier.fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally) {

                generateImages()

                var text= remember {
                    mutableStateOf("")
                }

                /*
                Button(onClick = {
                    objeto_view_Model.Add()
                }) {
                    Text(text = "sumar +1 ")

                }
                Button(onClick = {
                    objeto_view_Model.Addq()
                }) {
                    Text(text = "sumar 2+2 ")

                }
                Button(onClick = {
                    objeto_view_Model.Addw()
                }) {
                    Text(text = "restar +5 ")

                }

                Button(onClick = {
                    objeto_view_Model.Adde()
                }) {
                    Text(text = "restar -5 ")

                }

                */
                Text(text = "total a pagar:"+objeto_view_Model.result.value.toString())
                //det data
                /*
                TextField(value = text.value, onValueChange = {
                    text.value=it
                })



                Button(onClick = {
                    objeto_view_Model.hello(text.value.toString())
                }) {
                    Text(text = "capturar nombre")
                }
                Text("value"+objeto_view_Model.text.value.toString())
                *

                 */
                generarSpinner(objeto_view_Model)

               // Text( ""+objeto_view_Model.text2.value.toString())

                //Text( ""+objeto_view_Model.counter1.value.toString())
                TextField(value = text.value, onValueChange = {
                    text.value=it
                }, keyboardActions = KeyboardOptions(KeyboardCapitalization.None,true,KeyboardType.Number),
                  modifier = Modifier
                      .width((240.dp)
                          //.padding(end = 20.dp)
                          )
                )
                Button(onClick = {

                    objeto_view_Model.reset1()
                    text.value
                }) {
                    Text(text = "aplicar")
                }
                Button(onClick = {

                    objeto_view_Model.reset1()
                }) {
                    Text(text = "reiniciar")
                }
            }

            }

        }
    }

@Composable
fun generateImages(){

    Image(painterResource(id = R.drawable.uts),"")


    }
@Composable
fun generarSpinner(ovm: DecimoViewModel) {

    var expanded by remember { mutableStateOf(false) }

    Box {
        Button(onClick = { expanded = !expanded }) {
            Text("Opciones")
            Icon(
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = null,
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = true },
        ) {

            DropdownMenuItem(onClick = {
                ovm.ftaco()
                ovm.setSum(ovm.taco.value)
                expanded = false
            }) {
                Text(text = "tacos $12")
            }
            DropdownMenuItem(onClick = {
                ovm.ftos()
                ovm.setSum(ovm.tostadas.value)

                expanded = false
            }) {
                Text(text = "Tostadas $15")
            }
            DropdownMenuItem(onClick = {
                ovm.femp()
                ovm.setSum(ovm.empanadas.value)

                expanded = false
            }) {
                Text(text = "Empanada $20")
            }
            DropdownMenuItem(onClick = {
                ovm.fsin()
                ovm.setSum(ovm.sicronozada.value)

                expanded = false
            }) {
                Text(text = "sincronizada $18")
            }
        }
    }
}
