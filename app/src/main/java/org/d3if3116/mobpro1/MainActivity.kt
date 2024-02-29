package org.d3if3116.mobpro1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.d3if3116.mobpro1.ui.theme.Mobpro1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mobpro1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Ariq Athallah", "6706223116", "D3IF-46-03")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, nim: String, kelas: String, modifier: Modifier = Modifier) {
    Text(
        text = "Halo nama saya $name\n dengan nim $nim\n kelas $kelas",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mobpro1Theme {
        Greeting("Ariq Athallah","6706223116", "D3IF-46-03" )
    }
}