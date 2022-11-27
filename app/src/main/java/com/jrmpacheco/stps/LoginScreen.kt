package com.jrmpacheco.stps

import android.app.Activity
import android.inputmethodservice.Keyboard.Row
import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun LoginScreen() {

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header(Modifier.align(Alignment.TopEnd))
        Body(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Body(modifier: Modifier) {
    Column(modifier = Modifier) {
        ImageLogo(modifier = Modifier)
        TxtEmail()
        Spacer(modifier = Modifier.size(16.dp))
        TxtPassword()
        Spacer(modifier = Modifier.size(32.dp))
        BtnLogin()
    }
}

@Composable
fun BtnLogin() {
    Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Iniciar Sesión")
    }
}

@Composable
fun TxtEmail() {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        label = { Text(text = "Usuario") },
        placeholder = { Text(text = "ex. jrmpacheco@outlook.com") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Nombre de Usuario o Email"
            )
        },
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun TxtPassword() {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        label = { Text(text = "Contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Contraseña / Clave"
            )
        },
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun ImageLogo(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.stps_01),
        contentScale = ContentScale.Fit,
        contentDescription = "STPS Logo",
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(50.dp)
            .clip(RoundedCornerShape(4.dp))
    )

}

@Composable
fun Header(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(imageVector = Icons.Default.Close, contentDescription = "Header", modifier.clickable {
        activity.finish()
    })
}

fun Sign(email : String, password : String): Boolean  {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length>6
}
