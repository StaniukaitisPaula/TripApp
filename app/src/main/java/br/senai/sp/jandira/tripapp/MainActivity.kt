package br.senai.sp.jandira.tripapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tripapp.ui.theme.TripAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripAppTheme {
                LonginScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Preview(showSystemUi = true)
@Composable

fun LonginScreen() {

    var emailState by rememberSaveable {
        mutableStateOf("")
    }
    var passdState by rememberSaveable {
        mutableStateOf("")
    }





    Surface(modifier = Modifier.fillMaxSize()) {

        //header
        Column() {
            Card() {
                
            }
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)) {
            //main
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(80.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.title),
                    fontSize = 48.sp,
                    color = Color(red = 207, green = 6, blue = 240),
                    fontWeight = FontWeight.Bold
                    // modifier = Modifier.padding(14.dp),
                )
                Text(
                    text = stringResource(id = R.string.title_sing),
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(48.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
            ) {
                OutlinedTextField(
                    value = emailState,
                    onValueChange = {emailState = it},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    label = { Text(text = stringResource(R.string.email)) }
                )
                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = passdState,
                    onValueChange = {passdState = it},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    label = { Text(text = stringResource(R.string.password) )}
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End,

            ) {
                Button(onClick = { /*TODO*/ } ,
                    modifier = Modifier
                        .width(134.dp)
                        .height(48.dp),
                    shape = RoundedCornerShape(15.dp),
                    ) {
                    Text(
                        stringResource(id = R.string.sign_in),
                        modifier = Modifier.padding(8.dp),
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row() {
                    Text(text = stringResource(id = R.string.title_account),
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,

                    )
                    Spacer(modifier = Modifier.width(4.dp))

                    Text(text = stringResource(id = R.string.sign_Up),
                        color = Color(red = 207, green = 6, blue = 240),
                        fontWeight = FontWeight.Bold

                    )
                }
            }


            //footer

        }
    }
    }