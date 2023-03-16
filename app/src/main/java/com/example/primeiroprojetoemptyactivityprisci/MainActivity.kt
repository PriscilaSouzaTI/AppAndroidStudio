package com.example.primeiroprojetoemptyactivityprisci

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeiroprojetoemptyactivityprisci.ui.theme.PrimeiroProjetoEmptyActivityPrisciTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiroProjetoEmptyActivityPrisciTheme {
                // A surface container using the 'background' color from the theme

                Saudacao()
                }
            }
        }
    }


@Composable
fun Saudacao() {
    Column() {
        Text(text = "Olá, povo!")
        Text(text = "Como estão?")
        Text(text = "Que dia maravilhoso!")
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrimeiroProjetoEmptyActivityPrisciTheme {

            Saudacao()
    }
}