package com.jrmpacheco.stps

import android.app.Activity
import android.util.Patterns
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(name = "Android greeting")
@Composable
fun StpsStatisticalSectorScreen() {
    FieldsStpsStatisticalSectorScreen(Modifier)
        Row() {
            TxtYear()
            TxtMonth()
        }

/*    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header(Modifier.align(Alignment.TopEnd))
        FieldsStpsStatisticalSectorScreen(Modifier)
    }*/
}

@Composable
fun FieldsStpsStatisticalSectorScreen(modifier: Modifier) {
    Column(modifier = Modifier) {
        TxtSalary()
        Spacer(modifier = Modifier.size(16.dp))
        TxtAge()
        Spacer(modifier = Modifier.size(16.dp))
        TxtGender()
        Spacer(modifier = Modifier.size(16.dp))
        TxtSector()
        Spacer(modifier = Modifier.size(16.dp))
        TxtState()
        Spacer(modifier = Modifier.size(32.dp))
        TxtMunicipality()
    }
}

@Composable
fun TxtYear() {
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
fun TxtMonth() {
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
fun TxtSalary() {
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
fun TxtAge() {
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
fun TxtGender() {
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
fun TxtSector() {
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
fun TxtState() {
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
fun TxtMunicipality() {
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





